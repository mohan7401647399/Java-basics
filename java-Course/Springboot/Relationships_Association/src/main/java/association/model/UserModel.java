package association.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;

	private String userName;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private AddressModel addressModel;

	@ManyToOne
	@JoinColumn(name = "dept_id")
	@JsonBackReference
	private DepartmentModel departmentModel;

	@ManyToMany
	@JoinTable(
			name = "user_course",
			joinColumns = @JoinColumn(name = "user_id"),
			inverseJoinColumns = @JoinColumn(name = "course_id")
	)
	private List<CourseModel> courseModels = new ArrayList<>();
}