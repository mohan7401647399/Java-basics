package association.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import association.Service.DeptService;
import association.model.DepartmentModel;

@RestController
@RequestMapping("/dept")
public class DeptController {

	@Autowired
	private DeptService deptService;

	@PostMapping("/create")
	public DepartmentModel createDept(@RequestBody DepartmentModel departmentModel) {
		return deptService.createDept(departmentModel);
	}

	@GetMapping("/get/{departmentId}")
	public DepartmentModel getDept(@PathVariable int departmentId) {
		return deptService.getDept(departmentId);
	}

	public List<DepartmentModel> getAllDept() {
		return deptService.getAllDept();
	}
}
