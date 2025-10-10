package association.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import association.model.DepartmentModel;
import association.model.UserModel;
import association.repository.DeptRepository;

@Service
public class DeptService {

	@Autowired
	private DeptRepository deptRepository;

	public DepartmentModel createDept(DepartmentModel departmentModel) {
		if (departmentModel.getUsers() != null) {
			for (UserModel user : departmentModel.getUsers()) {
				user.setDepartmentModel(departmentModel);
			}
		}

		return deptRepository.save(departmentModel);
	}

	public DepartmentModel getDept(int id) {
		return deptRepository.findById(id).orElseThrow();
	}

	public List<DepartmentModel> getAllDept() {
		return deptRepository.findAll();
	}
}
