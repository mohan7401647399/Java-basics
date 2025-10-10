package association.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import association.model.CourseModel;
import association.model.DepartmentModel;
import association.model.UserModel;
import association.repository.CourseRepository;
import association.repository.DeptRepository;
import association.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private DeptRepository deptRepository;

	@Autowired
	private CourseRepository courseRepository;

	public UserModel createUser(UserModel userModel) {

		if (userModel.getDepartmentModel() != null) {
			DepartmentModel department = userModel.getDepartmentModel();

			if (department.getDepartmentId() == null) {
				department = deptRepository.save(department);
			} else {
				department = deptRepository.findById(department.getDepartmentId()).orElseThrow();
			}
			userModel.setDepartmentModel(department);
		}
		return userRepository.save(userModel);
	}

	public UserModel createUserWithDept(UserModel userModel, int departmentId) {
		DepartmentModel department = deptRepository.findById(departmentId).orElseThrow();

		userModel.setDepartmentModel(department);
		return userRepository.save(userModel);
	}

	public UserModel createUserWithCourse(int userId, List<Integer> courseIds) {
		// get user
		UserModel user = userRepository.findById(userId).orElseThrow();

		// get course
		List<CourseModel> courses = courseRepository.findAllById(courseIds);

		// add course to user
		user.getCourseModels().addAll(courses);

		return userRepository.save(user);
	}

	public UserModel getUser(int userId) {
		return userRepository.findById(userId).orElseThrow();
	}

	public List<UserModel> getAllUsers() {
		return userRepository.findAll();
	}
}
