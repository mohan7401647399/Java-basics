package association.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import association.Service.CourseService;
import association.model.CourseModel;

@RestController
@RequestMapping("/course")
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@PostMapping("/create")
	public CourseModel createCourse(@RequestBody CourseModel courseModel) {
		return courseService.createCourse(courseModel);
	}
	
	@GetMapping("/get/{id}")
	public CourseModel getCourse(@PathVariable int id) {
		return courseService.getCourse(id);
	}
	
	@GetMapping("/getAll")
	public List<CourseModel> getAllCourses() {
		return courseService.getAllCourses();
	}
}
