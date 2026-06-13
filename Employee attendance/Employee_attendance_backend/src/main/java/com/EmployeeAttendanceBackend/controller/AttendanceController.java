package com.EmployeeAttendanceBackend.controller;

import java.time.LocalDate;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeAttendanceBackend.DTO.MonthlySummaryDTO;
import com.EmployeeAttendanceBackend.entity.Attendance;
import com.EmployeeAttendanceBackend.entity.User;
import com.EmployeeAttendanceBackend.repository.UserRepository;
import com.EmployeeAttendanceBackend.service.AttendanceService;

@RestController
@RequestMapping("/api/attendance")
public class AttendanceController {

	@Autowired
	private AttendanceService attendanceService;

	@Autowired
	private UserRepository userRepository;

	@PostMapping("/check-in")
	public ResponseEntity<?> checkIn(Authentication authentication) {

		String username = authentication.getName();
		User user = userRepository.findByUsername(username).orElseThrow(() -> new RuntimeException("User not found"));

		try {
			Attendance attendance = attendanceService.checkIn(user.getId());
			return ResponseEntity.ok(attendance);

		} catch (IllegalStateException ex) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
		}
	}

	@PostMapping("/check-out")
	public ResponseEntity<?> checkOut(Authentication authentication) {

		try {
			String username = authentication.getName();
			User user = userRepository.findByUsername(username)
					.orElseThrow(() -> new RuntimeException("User not found"));

			Attendance attendance = attendanceService.checkOut(user.getId());
			return ResponseEntity.ok(attendance);

		} catch (IllegalStateException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Something went wrong: " + e.getMessage());
		}
	}

	@PostMapping("/daily")
	public ResponseEntity<?> dailyAttendance(
	        @RequestParam(required = false) String date,
	        Authentication authentication) {

	    String username = authentication.getName();

	    User user = userRepository.findByUsername(username).orElse(null);

	    if (user == null) {
	        return ResponseEntity.status(HttpStatus.NOT_FOUND)
	                .body("User not found");
	    }

	    LocalDate targetDate;
	    try {
	        targetDate = (date == null) ? LocalDate.now() : LocalDate.parse(date);
	    } catch (Exception e) {
	        System.err.println("Invalid date format: " + date);
	        return ResponseEntity.badRequest().body("Invalid date format. Use YYYY-MM-DD.");
	    }

	    return ResponseEntity.ok(attendanceService.getDailyAttendance(user.getId(), targetDate));
	}

	
	

	@PostMapping("/monthly")
	public ResponseEntity<?> monthlySummary( @RequestParam int year, @RequestParam int month, Authentication authentication) {

	    try {
	        if (month < 1 || month > 12) {
	            return ResponseEntity.badRequest().body(Map.of("error", "Invalid month: " + month));
	        }

	        String username = authentication.getName();

	        User user = userRepository.findByUsername(username).orElse(null);

	        if (user == null) {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Map.of("error", "User not found"));
	        }

	        MonthlySummaryDTO summary = attendanceService.getMonthlySummary(user.getId(), year, month);

	        return ResponseEntity.ok(summary);

	    } catch (Exception e) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Map.of("error", e.getMessage()));
	    }
	}


}
