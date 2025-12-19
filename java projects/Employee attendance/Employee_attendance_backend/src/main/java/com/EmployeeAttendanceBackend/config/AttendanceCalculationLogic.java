package com.EmployeeAttendanceBackend.config;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class AttendanceCalculationLogic {

	public String calculateStatus(LocalDateTime checkIn, LocalDateTime checkOut, double workingHours) {

		// Half-day condition
		if (workingHours < WorkingHoursConfig.FULL_DAY_HOURS && workingHours >= WorkingHoursConfig.HALF_DAY_HOURS)
			return "HALF_DAY";

        // Absent condition
		if (workingHours < WorkingHoursConfig.HALF_DAY_HOURS)
			return "ABSENT";

        // Late condition
		if (checkIn.toLocalTime().isAfter(WorkingHoursConfig.LAST_AFTER))
			return "LAST";

		return "PRESENT";
	}
}
