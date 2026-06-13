package com.EmployeeAttendanceBackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeAttendanceBackend.DTO.LeaveApplyRequest;
import com.EmployeeAttendanceBackend.entity.LeaveRequest;
import com.EmployeeAttendanceBackend.entity.User;
import com.EmployeeAttendanceBackend.repository.UserRepository;
import com.EmployeeAttendanceBackend.service.LeaveService;

@RestController
@RequestMapping("/api/leave")
public class LeaveController {

	@Autowired
	private LeaveService leaveService;

	@Autowired
	private UserRepository userRepository;

	@PostMapping("/apply")
	public ResponseEntity<?> applyLeave(@RequestBody LeaveApplyRequest request, Authentication authentication) {

		String username = authentication.getName();

		User user = userRepository.findByUsername(username).orElse(null);

		if (user == null) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid user or user not found");
		}

		LeaveRequest leave = leaveService.applyLeave(user.getId(), request);

		if (leave == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Leave already applied for this date");
		}

		return ResponseEntity.ok(leave);
	}
}
