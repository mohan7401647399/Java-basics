package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		return http
				.csrf(csrf -> csrf.disable())
				.httpBasic(Customizer.withDefaults())
				.formLogin(Customizer.withDefaults())
				.authorizeHttpRequests(requests -> requests
						.requestMatchers("/admin/**").hasRole("ADMIN")
						.requestMatchers("/user/**").hasRole("USER")
						.requestMatchers("/role/**").hasAnyAuthority("ROLE_USER")
						.requestMatchers("/home").permitAll()
						.anyRequest().authenticated()
				)
				.build();
	}
	
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();	
	}
	
	@Bean
	public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
		
		UserDetails user1 = User
								.builder()
								.username("mohan")
								.password(passwordEncoder.encode("mohan@123"))
								.roles("USER")					//	role assigned
								.build();
		
		UserDetails admin1 = User
								.builder()
								.username("admin")
								.password(passwordEncoder.encode("admin@123"))
								.roles("ADMIN")					//	role assigned
								
								.build();
		
		UserDetails anyUser = User
									.builder()
									.username("james")
									.password(passwordEncoder.encode("james@123"))
									.roles("USER", "ADMIN")		//	role assigned
									.build();
		
		UserDetails roleUser = User
									.builder()
									.username("mickel")
									.password(passwordEncoder.encode("mickel@123"))
									.authorities("ROLE_USER")	//	role assigned with prefix
									.build();
		
		return new InMemoryUserDetailsManager(user1, admin1, anyUser, roleUser);
	}
}
