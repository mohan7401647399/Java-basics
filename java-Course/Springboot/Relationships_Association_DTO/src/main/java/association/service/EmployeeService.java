package association.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import association.DTO.AddressDTO;
import association.DTO.DeptDTO;
import association.DTO.EmployeeDTO;
import association.model.AddressModel;
import association.model.EmployeeModel;
import association.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	// Conversion:- Entity to DTO
	private EmployeeDTO EntityToDTO(EmployeeModel employee) {
		// employee DTO
		EmployeeDTO dto = new EmployeeDTO();

		dto.setEmployeeId(employee.getEmployeeId());
		dto.setEmail(employee.getEmail());
		dto.setEmployeeName(employee.getEmployeeName());

		if (employee.getAddress() != null) {
			// address DTO
			AddressDTO addressDTO = new AddressDTO();

			addressDTO.setAddressId(employee.getAddress().getAddressId());
			addressDTO.setStreet(employee.getAddress().getStreet());
			addressDTO.setCity(employee.getAddress().getCity());
			addressDTO.setPincode(employee.getAddress().getPincode());

			dto.setAddress(addressDTO);
		}
		
		if(employee.getDepartment() != null) {
			DeptDTO dept = new DeptDTO();
			
			dept.setDeptId(employee.getDepartment().getDeptId());
			dept.setDepartmentName(employee.getDepartment().getDepartmentName());
			
			dto.setDept(dept);
		}
		
		return dto;
	}

	// Conversion:- DTO to Entity
	private EmployeeModel DTOToEntity(EmployeeDTO dto) {
		// employee entity
		EmployeeModel employee = new EmployeeModel();

		employee.setEmployeeId(dto.getEmployeeId());
		employee.setEmployeeName(dto.getEmployeeName());
		employee.setEmail(dto.getEmail());

		if (dto.getAddress() != null) {
			// address entity
			AddressModel address = new AddressModel();

			address.setAddressId(dto.getAddress().getAddressId());
			address.setStreet(dto.getAddress().getStreet());
			address.setCity(dto.getAddress().getCity());
			address.setPincode(dto.getAddress().getPincode());

			employee.setAddress(address);
		}

		return employee;
	}

	// create employee
	public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
		// convert DTO to Entity
		EmployeeModel employee = DTOToEntity(employeeDTO);
		// save to database
		EmployeeModel saved = employeeRepository.save(employee);
		// convert - Entity to DTO and save
		return EntityToDTO(saved);
	}

	// get all employees
	public List<EmployeeDTO> getAllEmployees() {
		return employeeRepository.findAll().stream().map(this::EntityToDTO).collect(Collectors.toList());
	}

	// get employee
	public EmployeeDTO getEmployee(int id) {
		EmployeeModel emp = employeeRepository.findById(id).orElseThrow();

		return EntityToDTO(emp);
	}
	
	//	update employee
	public EmployeeDTO updateEmployee(int id, EmployeeDTO employeeDTO) {
		//	employee entity
		EmployeeModel emp = employeeRepository.findById(id).orElseThrow();
		emp.setEmail(employeeDTO.getEmail());
		emp.setEmployeeName(employeeDTO.getEmployeeName());
		
		//	address entity
		AddressModel address = emp.getAddress();
		
		address.setStreet(employeeDTO.getAddress().getStreet());
		address.setCity(employeeDTO.getAddress().getCity());
		address.setPincode(employeeDTO.getAddress().getPincode());
		//	employee entity
		EmployeeModel updated = employeeRepository.save(emp);
		
		return EntityToDTO(updated);
	}
	
	
	//	delete employee
	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);
	}

}
