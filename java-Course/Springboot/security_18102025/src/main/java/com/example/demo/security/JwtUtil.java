package com.example.demo.security;

import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {

	// Secret key string used for signing the JWT.
	private static final String SECRET_KEY_STRING = "G3xy3WpPlAfhW2DK3se5BOIVXMBw2bzr";

	// Convert the secret key string into a SecretKey object.
	private final SecretKey SECRET_KEY = Keys.hmacShaKeyFor(SECRET_KEY_STRING.getBytes()); // Keys.hmacShaKeyFor() ensures compatibility with HMAC algorithms like HS256.

	//	Generate a JWT token for a given user.
	public String generateToken(UserDetails userDetails) {
		return Jwts.builder()
				.setSubject(userDetails.getUsername())									// Store username as subject
				.setIssuedAt(new Date())												// Set current issue time
				.setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60))	// 1 hour validity
				.signWith(SECRET_KEY)													// Sign token with secret key
				.compact();																// Generate compact JWT string
	}

	// Extract userName from a JWT token
	public String extractUsername(String token) {
		return extractAllClaims(token).getSubject();
	}

	// Validate the token against the given user details.
	public boolean validateToken(String token, UserDetails userDetails) {
		return extractUsername(token).equals(userDetails.getUsername()) && !isTokenExpired(token);
	}

	// Check whether a JWT token is expired.
	private boolean isTokenExpired(String token) {
		return extractAllClaims(token).getExpiration().before(new Date());
	}

	//	Extract all claims (payload data) from the JWT token.
	private Claims extractAllClaims(String token) {
		return Jwts.parserBuilder()
				.setSigningKey(SECRET_KEY)	// Set key for signature verification
				.build()
				.parseClaimsJws(token)		// Parse and validate JWT
				.getBody();					// Extract token claims
	}
}