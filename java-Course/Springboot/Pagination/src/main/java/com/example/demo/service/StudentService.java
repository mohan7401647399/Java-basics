package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo studentRepo;

	//	get all students with page
//	public Page<Student> getStudentWithPagination(int pageNumber, int pageSize) {
//		Pageable pageable = PageRequest.of(pageNumber, pageSize);
//
//		return studentRepo.findAll(pageable);
//	}
	
	public Page<Student> getStudentWithPaginationAndSorting(int pageNumber, int pageSize, String sortField) {
		Pageable pageable = PageRequest.of(pageNumber, pageSize, Sort.by(sortField).ascending());

		return studentRepo.findAll(pageable);
	}
}
