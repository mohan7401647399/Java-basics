package ems.util;

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
public class JwtUtils {

	// Secret key from application.properties (used to sign JWT)
	@Value("${jwt.secret}")
	private String secret;
	
	// Token expiration time (in milliseconds)
	@Value("${jwt.expiration}")
	private long expiration;
	
	// SecretKey object created from secret string
	private SecretKey key;
	
	// This method runs after object creation and initializes the signing key
	@PostConstruct
	public void init() {
		this.key = Keys.hmacShaKeyFor(secret.getBytes());
	}
	
	// ***************************************
	// Method to generate JWT Token
	// ***************************************
	public String generateToken(UserDetails userDetails) {
		return Jwts
				.builder()
				.setSubject(userDetails.getUsername())      // Set username in token
				.setIssuedAt(new Date())                    // Token issued time
				.setExpiration(new Date(System.currentTimeMillis() + expiration))  // Expiry time
				.signWith(key, SignatureAlgorithm.HS256)    // Sign token using secret key
				.compact();                                 // Convert to String format
	}
	
	// ***************************************
	// Validate JWT Token
	// ***************************************
	public boolean validateToken(String token, UserDetails userDetails) {
		String username = extractUsername(token);     // Extract username from token
		
		// Valid only if username matches AND token is not expired
		return username.equals(userDetails.getUsername()) && !isTokenExpired(token);
	}
	
	// ***************************************
	// Check if token is expired
	// ***************************************
	public boolean isTokenExpired(String token) {
		return getClaims(token).getExpiration().before(new Date());
	}
	
	// ***************************************
	// Extract username from token
	// ***************************************
	public String extractUsername(String token) {
		return getClaims(token).getSubject();
	}
	
	// ***************************************
	// Extract all claims (payload) from token
	// ***************************************
	public Claims getClaims(String token) {
		return Jwts
				.parserBuilder()
				.setSigningKey(key)              // Set signing key for verification
				.build()
				.parseClaimsJws(token)           // Parse and validate token
				.getBody();                      // Return token body (claims)
	}
}