package com.EmployeeAttendanceBackend.config;

import java.time.LocalTime;

import org.springframework.stereotype.Component;

@Component
public class WorkingHoursConfig {
	public static final LocalTime OFFICE_START = LocalTime.of(9, 0);
	public static final LocalTime LAST_AFTER = LocalTime.of(9, 15);
	public static final LocalTime OFFICE_END = LocalTime.of(18, 0);
	
	public static final double FULL_DAY_HOURS = 8.0;
	public static final double HALF_DAY_HOURS = 4.0;
}
