package com.EmployeeAttendanceBackend.DTO;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DailyAttendanceDTO {

	private LocalDate date;

	private LocalDateTime checkIn;

	private LocalDateTime checkOut;

	private Double workingHours;

	private String status;
}
