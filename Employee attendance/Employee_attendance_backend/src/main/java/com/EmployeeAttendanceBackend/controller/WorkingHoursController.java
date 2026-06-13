package com.EmployeeAttendanceBackend.controller;

import java.time.LocalDate;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeAttendanceBackend.entity.User;
import com.EmployeeAttendanceBackend.repository.UserRepository;
import com.EmployeeAttendanceBackend.service.WorkingHoursService;

@RestController
@RequestMapping("/api/workingHours")
public class WorkingHoursController {

	@Autowired
	private WorkingHoursService service;

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/daily")
	public ResponseEntity<?> dailyHours(@RequestParam String date, Authentication authentication) {

		try {
			if (authentication == null) {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Map.of("error", "User not authenticated"));
			}

			String username = authentication.getName();

			// Fetch user safely
			User user = userRepository.findByUsername(username).orElse(null);

			if (user == null) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Map.of("error", "User not found"));
			}

			// Parse date safely
			LocalDate targetDate;

			try {
				targetDate = LocalDate.parse(date);
			} catch (Exception ex) {
				return ResponseEntity.badRequest().body(Map.of("error", "Invalid date format. Use yyyy-MM-dd"));
			}

			double hours = service.getDailyWorkingHours(user.getId(), targetDate);

			return ResponseEntity.ok(Map.of("Date", targetDate.toString(), "WorkingHours", hours));

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body(Map.of("error", "Something went wrong", "details", e.getMessage()));
		}
	}

	@GetMapping("/monthly")
	public ResponseEntity<?> monthlyHours(@RequestParam int year, @RequestParam int month, Authentication authentication) {

		try {
			String username = authentication.getName();

			// Handle "user not found" WITHOUT custom exception
			User user = userRepository.findByUsername(username).orElseThrow(() -> new RuntimeException("User not found"));

			double hours = service.getMonthlyWorkingHours(user.getId(), year, month);

			return ResponseEntity.ok(Map.of("Year", year, "Month", month, "TotalWorkingHours", hours));

		} catch (RuntimeException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("error", e.getMessage()));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body(Map.of("error", "Something went wrong", "details", e.getMessage()));
		}
	}

}
