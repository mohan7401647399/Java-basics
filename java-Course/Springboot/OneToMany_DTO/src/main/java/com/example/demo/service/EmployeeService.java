package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.EmpDTO;
import com.example.demo.Repository.DeptRepo;
import com.example.demo.Repository.EmployeeRepo;
import com.example.demo.model.DeptModel;
import com.example.demo.model.EmployeeModel;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Autowired
	private DeptRepo deptRepo;

	//	Convert -> Entity to DTO
	public EmpDTO EntityToDTO(EmployeeModel emp) {
		//	employee DTO
		EmpDTO dto = new EmpDTO();

		dto.setEmpId(emp.getEmpId());
		dto.setEmpName(emp.getEmpName());

		dto.setDeptId(emp.getDept().getDeptId());

		return dto;
	}

	// create employee
	public EmpDTO createEmployee(EmpDTO empDTO) {
		//	employee entity
		EmployeeModel emp = new EmployeeModel();

		emp.setEmpName(empDTO.getEmpName());
		//	department entity
		DeptModel dept = deptRepo.findById(empDTO.getDeptId())
				.orElseThrow(() -> new RuntimeException("Dept not found " + empDTO.getDeptId()));

		emp.setDept(dept);

		EmployeeModel savedEmp = employeeRepo.save(emp);

		return EntityToDTO(savedEmp);
	}

	// get all employees
	public List<EmpDTO> getAllEmployees() {
		return employeeRepo.findAll().stream().map(this::EntityToDTO).toList();
	}
}
