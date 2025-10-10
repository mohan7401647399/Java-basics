package association.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int courseId;
	
	private String courseName;
	
	@ManyToMany(mappedBy = "courseModels")
	@JsonBackReference
	private List<UserModel> users = new ArrayList<>();
}
