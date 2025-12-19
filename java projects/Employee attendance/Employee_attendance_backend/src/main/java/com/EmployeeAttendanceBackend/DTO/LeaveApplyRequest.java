package com.EmployeeAttendanceBackend.DTO;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LeaveApplyRequest {

	private LocalDate leaveDate;
	
	private String leaveType; 		//	FULL-DAY, HALD-DAY
	
	private String reason;
}
