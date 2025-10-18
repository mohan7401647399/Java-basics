package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.example.demo.security.CustomUserDetailsServices;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityfilterchain(HttpSecurity http) throws Exception {
		http.csrf(csrf -> csrf.disable()).authorizeHttpRequests(
//				auths -> auths.requestMatchers("/user/**").authenticated().requestMatchers("/home").permitAll());
//				auths -> auths.requestMatchers("/user/**").authenticated().requestMatchers("/").permitAll())
				auths -> auths.requestMatchers(HttpMethod.POST, "/user/create").permitAll() // anyone can create a new user (no login required)
						.requestMatchers("/user/**").authenticated() // All other /user APIs (GET, PUT, DELETE, etc.) require authentication
//						.requestMatchers("/").permitAll() // without credential
						.anyRequest().permitAll() // Everything else open (optional)
//		).httpBasic(); // for postman
		).formLogin(form -> form.permitAll().defaultSuccessUrl("/dashboard")); // default login page
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
		return new CustomUserDetailsServices();
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
}
