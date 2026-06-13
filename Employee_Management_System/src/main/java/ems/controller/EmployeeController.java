package ems.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ems.dto.EmployeeDTO;
import ems.service.EmployeeService;

@RestController                                 // Marks this class as a REST controller
@RequestMapping("/api/employees")               // Base URL for all employee-related APIs
public class EmployeeController {

	@Autowired                                  // Injecting EmployeeService for business logic
	private EmployeeService employeeService;
	
	// --------------------------------------------
	// GET: Fetch all employees
	// URL: /api/employees/getall
	// --------------------------------------------
	@GetMapping("/getall")
	public List<EmployeeDTO> getAllEmployees() {
		// Calls the service to return all employee details
		return employeeService.getAllEmployees();
	}
	
	// --------------------------------------------
	// GET: Fetch employee by ID
	// URL: /api/employees/{id}
	// --------------------------------------------
	@GetMapping("/{id}")
	public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable Long id) {
		// Optional is used to avoid null checks
		Optional<EmployeeDTO> employee = employeeService.getEmployeeById(id);
		
		// If employee found -> return 200 OK response
		// If not -> return 404 Not Found
		return employee.map(ResponseEntity::ok)
		               .orElse(ResponseEntity.notFound().build());
	}
	
	// --------------------------------------------
	// POST: Create a new employee
	// URL: /api/employees/create
	// --------------------------------------------
	@PostMapping("/create")
	public EmployeeDTO createEmployee(@RequestBody EmployeeDTO dto) {
		// Receives JSON input and creates a new employee
		return employeeService.createEmployee(dto);
	}
	
	// --------------------------------------------
	// PUT: Update an existing employee
	// URL: /api/employees/update/{id}
	// --------------------------------------------
	@PutMapping("/update/{id}")
	public ResponseEntity<EmployeeDTO> updateEmployee(@PathVariable Long id,
	                                                  @RequestBody EmployeeDTO dto) {
		// Service returns updated employee if found
		Optional<EmployeeDTO> updateEmployee = employeeService.updateEmployee(id, dto);
		
		// Return updated data OR 404 Not Found
		return updateEmployee.map(ResponseEntity::ok)
		                     .orElse(ResponseEntity.notFound().build());
	}
	
	// --------------------------------------------
	// DELETE: Remove employee by ID
	// URL: /api/employees/delete/{id}
	// --------------------------------------------
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteEmployee(@PathVariable Long id) {
		// Service returns true only if delete is successful
		if (employeeService.deleteEmployee(id)) {
			return ResponseEntity.ok().body("Employee deleted successfully");
		} else {
			return ResponseEntity.notFound().build(); // If employee not found
		}
	}
	
	// --------------------------------------------
	// GET: Filter employees by department
	// URL: /api/employees/department/{department}
	// --------------------------------------------
	@GetMapping("/department/{department}")
	public List<EmployeeDTO> getEmployeeByDepartment(@PathVariable String department) {
		// Returns list of employees belonging to specific department
		return employeeService.getEmployeesByDepartment(department);
	}
	
	// --------------------------------------------
	// GET: Search employees by keyword (name, email, etc.)
	// URL: /api/employees/search?keyword=abc
	// --------------------------------------------
	@GetMapping("/search")
	public List<EmployeeDTO> searchEmployee(@RequestParam String keyword) {
		// Returns search result based on keyword
		return employeeService.searchEmployees(keyword);
	}
}