package association.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DepartmentModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer departmentId;
	
	private String deptName;
	
	//	One department can have many users
	@OneToMany(mappedBy = "departmentModel", cascade = CascadeType.ALL)
//	@JsonBackReference
	private List<UserModel> users = new ArrayList<>();
}
