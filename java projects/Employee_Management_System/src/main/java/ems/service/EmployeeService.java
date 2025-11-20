package ems.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ems.dto.EmployeeDTO;
import ems.entity.Employee;
import ems.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	//	get all employees
	public List<EmployeeDTO> getAllEmployees() {
		return employeeRepository.findByActiveTrue().stream().map(this::EntityToDTO).collect(Collectors.toList());
	}

	//	get employee by id
	public Optional<EmployeeDTO> getEmployeeById(Long id) {
		return employeeRepository.findById(id).filter(Employee::getActive).map(this::EntityToDTO);
	}

	//	create employee
	public EmployeeDTO createEmployee(EmployeeDTO dto) {
		Employee employee = DTOtoEntity(dto);

		Employee savedEmployee = employeeRepository.save(employee);

		return EntityToDTO(savedEmployee);
	}
	
	//	update employee
	public Optional<EmployeeDTO> updateEmployee(Long id, EmployeeDTO employeeDTO) {
        return employeeRepository.findById(id)
                .map(existingEmployee -> {
                    updateEntityFromDTO(existingEmployee, employeeDTO);
                    Employee updatedEmployee = employeeRepository.save(existingEmployee);
                    return EntityToDTO(updatedEmployee);
                });
    }

	//	delete employee
    public boolean deleteEmployee(Long id) {
        return employeeRepository.findById(id)
                .map(employee -> {
                    employee.setActive(false);
                    employeeRepository.save(employee);
                    return true;
                })
                .orElse(false);
    }

    //get employee by department
    public List<EmployeeDTO> getEmployeesByDepartment(String department) {
        return employeeRepository.findByDepartment(department).stream()
                .filter(Employee::getActive)
                .map(this::EntityToDTO)
                .collect(Collectors.toList());
    }

    //	search by employee
    public List<EmployeeDTO> searchEmployees(String keyword) {
        return employeeRepository.findByFirstNameContainingOrLastNameContaining(keyword, keyword).stream()
                .filter(Employee::getActive)
                .map(this::EntityToDTO)
                .collect(Collectors.toList());
    }
	
    //	convert entity to DTO
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

	//	convert DTO to Entity
	private Employee DTOtoEntity(EmployeeDTO dto) {
		Employee employee = new Employee();
		employee.setFirstName(dto.getFirstName());
		employee.setLastName(dto.getLastName());
		employee.setEmail(dto.getEmail());
		employee.setPhoneNumber(dto.getPhoneNumber());
		employee.setDepartment(dto.getDepartment());
		employee.setPosition(dto.getPosition());
		employee.setSalary(dto.getSalary());
		employee.setHireDate(java.time.LocalDateTime.now());

		return employee;
	}

	//	update DTO to Entity
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
