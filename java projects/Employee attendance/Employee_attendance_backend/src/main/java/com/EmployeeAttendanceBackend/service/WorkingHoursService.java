package com.EmployeeAttendanceBackend.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeAttendanceBackend.repository.AttendanceRepository;

@Service
public class WorkingHoursService {

	@Autowired
	private AttendanceRepository attendanceRepository;

	// DAILY HOURS
	public double getDailyWorkingHours(Long userId, LocalDate date) {
		return attendanceRepository
				.findByUserIdAndAttendanceDate(userId, date)
				.map(e -> e.getWorkingHours() == null ? 0 : e.getWorkingHours())
				.orElse(0.0);
	}
	
	//	MONTHLY HOURS
	public double getMonthlyWorkingHours(Long userId, int year, int month) {
		
		LocalDate start = LocalDate.of(year, month, 1);
		LocalDate end = start.withDayOfMonth(start.lengthOfMonth());
		
		return attendanceRepository
				.findByUserIdAndAttendanceDateBetween(userId, start, end)
				.stream()
				.mapToDouble(a -> a.getWorkingHours() == null ? 0 : a.getWorkingHours())
				.sum();
	}
}
