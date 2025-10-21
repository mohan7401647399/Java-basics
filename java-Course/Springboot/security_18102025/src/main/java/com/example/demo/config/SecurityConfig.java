package com.example.demo.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.example.demo.security.CustomUserDetailsServices;
import com.example.demo.security.JwtFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Autowired
	private CustomUserDetailsServices customUserDetailsServices;

	@Autowired
	private JwtFilter jwtFilter;

	@Bean
	public SecurityFilterChain securityfilterchain(HttpSecurity http) throws Exception {
		http.csrf(csrf -> csrf.disable()).authorizeHttpRequests(
//				auths -> auths.requestMatchers("/user/**").authenticated().requestMatchers("/home").permitAll());
//				auths -> auths.requestMatchers("/user/**").authenticated().requestMatchers("/").permitAll())
//				auth -> auth.requestMatchers(HttpMethod.POST, "/user/create").permitAll() // anyone can create a new user (no login required)
				auth -> auth.requestMatchers("/auth/login", "/user/create").permitAll() // anyone can create a new user (no login required)
						.anyRequest().authenticated()
//						.requestMatchers("/user/**").authenticated() // All other /user APIs (GET, PUT, DELETE, etc.)
		// require authentication
//						.requestMatchers("/").permitAll() // without credential
//						.anyRequest().permitAll() // Everything else open (optional)
		).sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
				.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
//		).formLogin(form -> form.permitAll().defaultSuccessUrl("/dashboard")); // default login page for websites
		return http.build();
	}

	// In memory user for testing purpose
//	@Bean
//	public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
//		UserDetails user = User.withUsername("alice").password(passwordEncoder.encode("alice123")).roles("user")
//				.build();
//
//		UserDetails admin = User.withUsername("mohan").password(passwordEncoder.encode("mohan123")).roles("admin")
//				.build();
//
//		return new InMemoryUserDetailsManager(user, admin);
//	}

	@Bean
	public UserDetailsService userDetailService() {
		return customUserDetailsServices;
	}

	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		authProvider.setUserDetailsService(userDetailService());
		authProvider.setPasswordEncoder(passwordEncoder());

		return authProvider;
	}

	// password encryption
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public AuthenticationManager authenticationManager() {
		return new ProviderManager(List.of(authenticationProvider()));
	}
}
