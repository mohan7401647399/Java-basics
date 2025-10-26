package com.example.demo.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http
		.csrf(c -> c.disable())
		.authorizeHttpRequests(auth -> auth
				.requestMatchers("/register").permitAll()
				.anyRequest().authenticated()	
		)
		.formLogin();
		
		return http.build();
	}
}
