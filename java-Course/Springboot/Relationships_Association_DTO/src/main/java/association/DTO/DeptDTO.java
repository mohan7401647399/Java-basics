package association.DTO;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeptDTO {

	private int deptId;
	
	private String departmentName;
	
	private List<EmployeeDTO> employees;
}
