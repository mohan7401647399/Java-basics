package ems.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ems.dto.EmployeeDTO;
import ems.entity.Employee;
import ems.repository.EmployeeRepository;

@Service   // Marks this class as a Spring service (business logic layer)
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository; // Injecting Repository object

	// ---------------------------------------------------------------
	// GET ALL EMPLOYEES (only active employees)
	// ---------------------------------------------------------------
	public List<EmployeeDTO> getAllEmployees() {
		return employeeRepository
				.findByActiveTrue()          // fetch only active employees
				.stream()
				.map(this::EntityToDTO)      // convert each entity to DTO
				.collect(Collectors.toList());
	}

	// ---------------------------------------------------------------
	// GET EMPLOYEE BY ID (only if active)
	// ---------------------------------------------------------------
	public Optional<EmployeeDTO> getEmployeeById(Long id) {
		return employeeRepository
				.findById(id)               // find employee by id
				.filter(Employee::getActive) // return only active employees
				.map(this::EntityToDTO);     // convert entity to DTO
	}

	// ---------------------------------------------------------------
	// CREATE NEW EMPLOYEE
	// ---------------------------------------------------------------
	public EmployeeDTO createEmployee(EmployeeDTO dto) {
		Employee employee = DTOtoEntity(dto);     // convert DTO to entity
		Employee savedEmployee = employeeRepository.save(employee); // save into DB
		return EntityToDTO(savedEmployee);        // return saved employee as DTO
	}

	// ---------------------------------------------------------------
	// UPDATE EMPLOYEE
	// ---------------------------------------------------------------
	public Optional<EmployeeDTO> updateEmployee(Long id, EmployeeDTO employeeDTO) {
        return employeeRepository.findById(id)     // find employee
                .map(existingEmployee -> {
                    updateEntityFromDTO(existingEmployee, employeeDTO); // update fields
                    Employee updatedEmployee = employeeRepository.save(existingEmployee); // save changes
                    return EntityToDTO(updatedEmployee); // return updated data as DTO
                });
    }

	// ---------------------------------------------------------------
	// DELETE EMPLOYEE (soft delete → set active = false)
	// ---------------------------------------------------------------
    public boolean deleteEmployee(Long id) {
        return employeeRepository.findById(id)
                .map(employee -> {
                    employee.setActive(false); // mark as inactive instead of deleting record
                    employeeRepository.save(employee);
                    return true;
                })
                .orElse(false); // return false if employee not found
    }

    // ---------------------------------------------------------------
    // GET EMPLOYEES BY DEPARTMENT
    // ---------------------------------------------------------------
    public List<EmployeeDTO> getEmployeesByDepartment(String department) {
        return employeeRepository
        		.findByDepartment(department)
        		.stream()
                .filter(Employee::getActive)  // include only active employees
                .map(this::EntityToDTO)
                .collect(Collectors.toList());
    }

    // ---------------------------------------------------------------
    // SEARCH EMPLOYEES (by first name or last name)
    // ---------------------------------------------------------------
    public List<EmployeeDTO> searchEmployees(String keyword) {
        return employeeRepository
        		.findByFirstNameContainingOrLastNameContaining(keyword, keyword)
        		.stream()
                .filter(Employee::getActive)  // search only active employees
                .map(this::EntityToDTO)
                .collect(Collectors.toList());
    }

	// ---------------------------------------------------------------
	// ENTITY → DTO (Convert DB object to response object)
	// ---------------------------------------------------------------
	private EmployeeDTO EntityToDTO(Employee employee) {
		EmployeeDTO dto = new EmployeeDTO();

		dto.setId(employee.getId());
		dto.setFirstName(employee.getFirstName());
		dto.setLastName(employee.getLastName());
		dto.setEmail(employee.getEmail());
		dto.setPhoneNumber(employee.getPhoneNumber());
		dto.setDepartment(employee.getDepartment());
		dto.setPosition(employee.getPosition());
		dto.setSalary(employee.getSalary());
		dto.setActive(employee.getActive());

		return dto;
	}

	// ---------------------------------------------------------------
	// DTO → ENTITY (Convert request object into DB object)
	// ---------------------------------------------------------------
	private Employee DTOtoEntity(EmployeeDTO dto) {
		Employee employee = new Employee();

		employee.setFirstName(dto.getFirstName());
		employee.setLastName(dto.getLastName());
		employee.setEmail(dto.getEmail());
		employee.setPhoneNumber(dto.getPhoneNumber());
		employee.setDepartment(dto.getDepartment());
		employee.setPosition(dto.getPosition());
		employee.setSalary(dto.getSalary());

		return employee;
	}

	// ---------------------------------------------------------------
	// UPDATE ENTITY FROM DTO (only update provided fields)
	// ---------------------------------------------------------------
	private void updateEntityFromDTO(Employee employee, EmployeeDTO dto) {
		if (dto.getFirstName() != null)
			employee.setFirstName(dto.getFirstName());

		if (dto.getLastName() != null)
			employee.setLastName(dto.getLastName());

		if (dto.getEmail() != null)
			employee.setEmail(dto.getEmail());

		if (dto.getPhoneNumber() != null)
			employee.setPhoneNumber(dto.getPhoneNumber());

		if (dto.getDepartment() != null)
			employee.setDepartment(dto.getDepartment());

		if (dto.getPosition() != null)
			employee.setPosition(dto.getPosition());

		if (dto.getSalary() != null)
			employee.setSalary(dto.getSalary());
	}
}