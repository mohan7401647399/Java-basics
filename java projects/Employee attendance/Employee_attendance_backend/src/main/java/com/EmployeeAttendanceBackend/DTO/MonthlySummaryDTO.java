package com.EmployeeAttendanceBackend.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MonthlySummaryDTO {

	private int totalDays;
	
	private int presentDays;
	
	private int absentDays;
	
	private int leaveDays;
	
	private double totalWorkingHours;
}
