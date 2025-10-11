package association.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import association.DTO.EmployeeDTO;
import association.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/create")
	public EmployeeDTO createEmployee(@RequestBody EmployeeDTO dto) {
		return employeeService.createEmployee(dto);
	}

	@GetMapping("/getAll")
	public List<EmployeeDTO> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@GetMapping("/get/{id}")
	public EmployeeDTO getEmployee(@PathVariable int id) {
		return employeeService.getEmployee(id);
	}

	@PutMapping("/update/{id}")
	public EmployeeDTO updateEmployee(@PathVariable int id, @RequestBody EmployeeDTO dto) {
		return employeeService.updateEmployee(id, dto);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable int id) {
		employeeService.deleteEmployee(id);
		return "Employee deleted";
	}
}