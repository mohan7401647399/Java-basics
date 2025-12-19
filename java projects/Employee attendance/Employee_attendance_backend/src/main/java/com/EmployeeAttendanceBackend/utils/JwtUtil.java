package com.EmployeeAttendanceBackend.utils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import jakarta.annotation.PostConstruct;

@Component
public class JwtUtil {

	
	// Secret key used to sign and verify the JWT	
	private SecretKey secret;

	// Injecting secret key value from application.properties
	@Value("${jwt.secret}")
	private String secret_key;
	
	// Injecting token expiration time (in milliseconds) from properties file
	@Value("${jwt.expiration}")
	private long expiration;
	
	// Initializes the secret key after dependency injection is done
	@PostConstruct
	public void init() {
		this.secret = Keys.hmacShaKeyFor(secret_key.getBytes());
	}
	
	
	public String generateToken(UserDetails userDetails) {
		Map<String, Object> claims = new HashMap<>();
		
		return Jwts.builder()
				.setClaims(claims)
				.setSubject(userDetails.getUsername())
				.setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis() + expiration))
				.signWith(secret, SignatureAlgorithm.HS256)
				.compact();
	}
	
	public String getUsernameFromToken(String token) {
		
		return Jwts.parserBuilder().setSigningKey(secret).build().parseClaimsJws(token).getBody().getSubject();
	}
	
	public boolean validateToken(String token, UserDetails userDetails) {
		
		final String username = getUsernameFromToken(token);
		
		return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
	}
	
	public boolean isTokenExpired(String token) {
		final Date expiration = Jwts.parserBuilder().setSigningKey(secret).build().parseClaimsJws(token).getBody().getExpiration();
		
		return expiration.before(new Date());
	}
}
