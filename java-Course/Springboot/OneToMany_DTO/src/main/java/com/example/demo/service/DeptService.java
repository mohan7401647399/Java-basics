package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.DeptDTO;
import com.example.demo.DTO.EmpDTO;
import com.example.demo.Repository.DeptRepo;
import com.example.demo.model.DeptModel;

@Service
public class DeptService {

	@Autowired
	private DeptRepo deptRepo;

	// Convert -> Entity to DTO
	private DeptDTO EntityToDTO(DeptModel dept) {
		DeptDTO deptDTO = new DeptDTO();

		deptDTO.setDeptId(dept.getDeptId());
		deptDTO.setDeptName(dept.getDeptName());

		if (dept.getEmployees() != null) {
			List<EmpDTO> employees = dept.getEmployees().stream().map(emp -> {
				EmpDTO e = new EmpDTO();
				e.setEmpId(emp.getEmpId());
				e.setEmpName(emp.getEmpName());
				e.setDeptId(dept.getDeptId());
				return e;
			}).toList();
			deptDTO.setEmployees(employees);
		}
		return deptDTO;
	}

	// create department
	public DeptDTO createDept(DeptDTO dto) {
		DeptModel dept = new DeptModel();

		dept.setDeptName(dto.getDeptName());

		DeptModel savedDept = deptRepo.save(dept);

		return EntityToDTO(savedDept);
	}

	// get All Department
	public List<DeptDTO> getAllDepts() {
		return deptRepo.findAll().stream().map(this::EntityToDTO).toList();
	}

	// get Department
	public DeptDTO getDept(int id) {
		DeptModel dept = deptRepo.findById(id).orElseThrow(() -> new RuntimeException("Dept id not found " + id));
		return EntityToDTO(dept);
	}
}
