package com.EmployeeAttendanceBackend.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeAttendanceBackend.DTO.LeaveApplyRequest;
import com.EmployeeAttendanceBackend.entity.LeaveRequest;
import com.EmployeeAttendanceBackend.repository.LeaveRepository;

@Service
public class LeaveService {

	@Autowired
	private LeaveRepository leaveRepository;

	public LeaveRequest applyLeave(Long userId, LeaveApplyRequest leaveApplyRequest) {

		if (leaveRepository.existsByUserIdAndLeaveDate(userId, leaveApplyRequest.getLeaveDate())) {
			return null;
		}

		LeaveRequest leave = new LeaveRequest();

		leave.setUserId(userId);
		leave.setLeaveDate(leaveApplyRequest.getLeaveDate());
		leave.setLeaveType(leaveApplyRequest.getLeaveType());
		leave.setReason(leaveApplyRequest.getReason());
		leave.setStatus("PENDING");
		leave.setAppliedAt(LocalDateTime.now());

		return leaveRepository.save(leave);
	}
}
