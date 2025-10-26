package com.example.demo.configs;

import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import jakarta.annotation.PostConstruct;

@Component
public class JwtUtil {

	@Value("${jwt.secret}")
	private String secret;

	@Value("${jwt.expiration}")
	private long expiration;
	
	private SecretKey secret_key;
	
	@PostConstruct
	public void init() {
		this.secret_key = Keys.hmacShaKeyFor(secret.getBytes());
	}
	
	//	Generate Token
	public String generateToken(UserDetails userDetails) {
		return Jwts
				.builder()
				.setSubject(userDetails.getUsername())
				.setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis() + expiration))
				.signWith(secret_key, SignatureAlgorithm.HS256)
				.compact();
	}
	
	//	Validate token
	public boolean validateToken(String token, UserDetails userDetails) {
		String username = extractUsername(token);
		return username.equals(userDetails.getUsername()) && !isTokenExpired(token);
	}
	
	public String extractUsername(String token) {
		return getClaims(token).getSubject();
	}
	
	public boolean isTokenExpired(String token) {
		return getClaims(token).getExpiration().before(new Date());
	}
	
	public Claims getClaims(String token) {
		return Jwts
				.parserBuilder()
				.setSigningKey(secret_key)
				.build()
				.parseClaimsJws(token)
				.getBody();
	}
}
