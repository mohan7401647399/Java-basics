package association.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import association.model.CourseModel;
import association.repository.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public CourseModel createCourse(CourseModel courseModel) {
		return courseRepository.save(courseModel);
	}
	
	public CourseModel getCourse(int id) {
		return courseRepository.findById(id).orElseThrow();
	}
	
	public List<CourseModel> getAllCourses(){
		return courseRepository.findAll();
	}
}
