package ems.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import ems.util.JwtAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Autowired
	private JwtAuthenticationFilter filter;   // Custom filter to validate JWT token

	@Autowired
	private UserDetailsService userDetailsService;   // Loads user details from DB

	// Bean for password encryption using BCrypt
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	// Main security configuration for HTTP security
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		return http
				// Disable CSRF because we are using JWT (stateless authentication)
				.csrf(csrf -> csrf.disable())	

				// Enables default basic authentication UI (optional)
				.httpBasic(Customizer.withDefaults())

				// Enables default Spring Security login form (optional)
				.formLogin(Customizer.withDefaults())

				// Authorization rules for URLs
				.authorizeHttpRequests(requests -> requests
						// Public APIs → No authentication required
						.requestMatchers("/v3/api-docs/**", "/swagger-ui/**", "/swagger-ui.html", "/api/auth/**")
							.permitAll()

						// Only ADMIN can create/update/delete employees
						.requestMatchers("/api/employees/create", "/api/employees/update", "/api/employees/delete")
							.hasAuthority("ADMIN")

						// USER + ADMIN can view employees
						.requestMatchers(
								"/api/employees/*", 
								"/api/employees/getall", 
								"/api/employees/search**",
								"/api/employees/department/**"
						).hasAnyAuthority("USER", "ADMIN")

						// Any other request → must be authenticated
						.anyRequest().authenticated()
				)

				// Make session stateless → Every request must carry JWT token
				.sessionManagement(session -> 
						session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
				)

				// Add JWT filter before username/password authentication filter
				.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class)

				.build();
	}

	// AuthenticationManager used for validating user login credentials
	@Bean
	public AuthenticationManager authenticationManager(PasswordEncoder passwordEncoder) {

		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();

		// Link custom user details service (loads user by username)
		provider.setUserDetailsService(userDetailsService);

		// Password encoder for comparing passwords
		provider.setPasswordEncoder(passwordEncoder);

		// Return manager with our provider
		return new ProviderManager(provider);
	}
}
