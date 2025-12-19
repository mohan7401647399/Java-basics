package com.EmployeeAttendanceBackend.service;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.EmployeeAttendanceBackend.DTO.DailyAttendanceDTO;
import com.EmployeeAttendanceBackend.DTO.MonthlySummaryDTO;
import com.EmployeeAttendanceBackend.config.AttendanceCalculationLogic;
import com.EmployeeAttendanceBackend.entity.Attendance;
import com.EmployeeAttendanceBackend.repository.AttendanceRepository;

@Service
public class AttendanceService {

	@Autowired
	private AttendanceRepository attendanceRepository;
	
	@Autowired
	private AttendanceCalculationLogic logic;

	public Attendance checkIn(Long userId) {

	    LocalDate today = LocalDate.now();

	    Optional<Attendance> existing = attendanceRepository
	            .findByUserIdAndAttendanceDate(userId, today);

	    if (existing.isPresent()) {
	        throw new IllegalStateException("Already checked in for today.");
	    }

	    Attendance attendance = new Attendance();
	    attendance.setUserId(userId);
	    attendance.setAttendanceDate(today);
	    attendance.setCheckInTime(LocalDateTime.now());
	    attendance.setAttendanceStatus("CHECKED_IN");

	    return attendanceRepository.save(attendance);
	}


	
	public Attendance checkOut(Long userId) {

	    LocalDate today = LocalDate.now();

	    Attendance attendance = attendanceRepository.findByUserIdAndAttendanceDate(userId, today)
	            .orElseThrow(() -> new IllegalStateException("Check-in not found for today"));

	    if (attendance.getCheckOutTime() != null) {
	        throw new IllegalStateException("Already checked-out today");
	    }

	    LocalDateTime checkOutTime = LocalDateTime.now();
	    attendance.setCheckOutTime(checkOutTime);

	    long minutes = Duration.between(attendance.getCheckInTime(), checkOutTime).toMinutes();
	    double hours = minutes;

	    attendance.setWorkingHours(hours);

	    String status = logic.calculateStatus(attendance.getCheckInTime(), checkOutTime, hours);
	    attendance.setAttendanceStatus(status);

	    return attendanceRepository.save(attendance);
	}

	
	
	
	public DailyAttendanceDTO getDailyAttendance(Long userId, LocalDate date) {

		Attendance attendance = attendanceRepository.findByUserIdAndAttendanceDate(userId, date).orElse(null);

		DailyAttendanceDTO dto = new DailyAttendanceDTO();

		dto.setDate(date);

		if (attendance == null) {
			System.err.println("No attendance found for userId: " + userId + " on " + date);
			dto.setStatus("ABSENT");
			return dto;
		}

		dto.setCheckIn(attendance.getCheckInTime());
		dto.setCheckOut(attendance.getCheckOutTime());
		dto.setWorkingHours(attendance.getWorkingHours());
		dto.setStatus(attendance.getAttendanceStatus());
		
		return dto;
	}

	public MonthlySummaryDTO getMonthlySummary(Long userId, int year, int month) {

	    try {
	        LocalDate start = LocalDate.of(year, month, 1);
	        LocalDate end = start.withDayOfMonth(start.lengthOfMonth());

	        List<Attendance> records = attendanceRepository.findByUserIdAndAttendanceDateBetween(userId, start, end);

	        MonthlySummaryDTO dto = new MonthlySummaryDTO();
	        dto.setTotalDays(start.lengthOfMonth());

	        int present = records.size();
	        double hours = records.stream().mapToDouble(a -> a.getWorkingHours() == null ? 0 : a.getWorkingHours()).sum();

	        dto.setPresentDays(present);
	        dto.setAbsentDays(dto.getTotalDays() - present);
	        dto.setLeaveDays(0);
	        dto.setTotalWorkingHours(hours);

	        return dto;

	    } catch (Exception e) {
	        throw e; // let controller handle response
	    }
	}

}
