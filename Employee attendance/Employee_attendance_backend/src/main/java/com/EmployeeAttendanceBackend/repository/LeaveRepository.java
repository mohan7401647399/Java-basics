package com.EmployeeAttendanceBackend.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EmployeeAttendanceBackend.entity.LeaveRequest;

@Repository
public interface LeaveRepository extends JpaRepository<LeaveRequest, Long> {

	boolean existsByUserIdAndLeaveDate(Long userId, LocalDate leaveDate);

	List<LeaveRequest> findByUserIdAndStatus(Long userId, String status);
}