package association.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

	private int employeeId;

	private String employeeName;
	private String email;
	
	private AddressDTO address;
	
	private DeptDTO dept;
}
