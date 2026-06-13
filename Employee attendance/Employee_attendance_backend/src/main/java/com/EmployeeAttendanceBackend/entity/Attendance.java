package com.EmployeeAttendanceBackend.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Attendance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Long userId;
	
	private LocalDate attendanceDate;
	
	private LocalDateTime checkInTime;
	
	private LocalDateTime checkOutTime;
	
	private Double workingHours;
	
	private String attendanceStatus;	// PRESENT, CHECKED_IN, CHECKED_OUT
}
