package com.example.demo.config;

import java.util.Date;

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

	
	/**
	 * Generates a JWT token for the authenticated user
	 * 
	 * @param userDetails - Spring Security user object containing username & roles
	 * @return Generated JWT token as a String
	 */
	public String generateToken(UserDetails userDetails) {
		return Jwts
				.builder()	// Set the subject (username) of the token
				.setSubject(userDetails.getUsername())	// Add custom claims (e.g., user role information)
				.claim("role", userDetails.getAuthorities())	// Add custom claims (e.g., user role information)
				.setIssuedAt(new Date())	// Token issue date
				.setExpiration(new Date(System.currentTimeMillis() + expiration))	// Token expiration time (current time + configured expiration duration)
				.signWith(secret, SignatureAlgorithm.HS256)	// Sign the token using HS256 algorithm and the secret key
				.compact();	// Compact() converts the token object to a string
	}
	
	
	/**
	 * Extracts the username (subject) from the JWT token
	 * 
	 * @param token - JWT token
	 * @return Username extracted from the token
	 */
	public String extractUsername(String token) {
		return Jwts
				.parserBuilder()	// Set the same signing key used to verify the token
				.setSigningKey(secret)
				.build()	// Parse the token and extract its claims (payload data)
				.parseClaimsJws(token)
				.getBody()
				.getSubject();	// Return the username (subject)
	}
	
	
	/**
	 * Validates the token by checking:
	 *  1. Username in token matches the user’s username
	 *  2. Token is not expired
	 * 
	 * @param token - JWT token
	 * @param userDetails - User details to validate against
	 * @return true if valid, false otherwise
	 */
	public boolean validateToken(String token, UserDetails userDetails) {
		String username = extractUsername(token);
		return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
	}
	
	
	/**
	 * Checks if the JWT token has expired
	 * 
	 * @param token - JWT token
	 * @return true if token is expired, false otherwise
	 */
	public boolean isTokenExpired(String token) {
		// Extract the expiration date from the token claims
		Date expirationDate = Jwts
				.parserBuilder()	
				.setSigningKey(secret)	
				.build()	
				.parseClaimsJws(token)
				.getBody()
				.getExpiration();
		
		return expirationDate.before(new Date());	// Check if expiration date is before current time
	}
}
