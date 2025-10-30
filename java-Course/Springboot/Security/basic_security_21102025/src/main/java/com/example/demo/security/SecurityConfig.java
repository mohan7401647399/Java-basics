package com.example.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.Customizer;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//		http.csrf(csrf -> csrf.disable()) // disable CSRF for testing with Postman
//				.authorizeHttpRequests(
//						auth -> auth
//						.requestMatchers("/api/employees/**").authenticated()
//						.anyRequest().permitAll())
//				.httpBasic();	//	Enable basic authentication
//
//		return http.build();
		
		
        // URL or Endpoint level
		return http
				.csrf(csrf -> csrf.disable())
				.httpBasic(Customizer.withDefaults())	// postman (or) Rest full service authentication
				.formLogin(form -> form.disable())	// MVC application authentication
				.authorizeHttpRequests(requests -> requests	//	Allows restricting access 
						.requestMatchers("/api/employees/**").authenticated()
						.anyRequest().permitAll()
					)
				.build();
	}
}
