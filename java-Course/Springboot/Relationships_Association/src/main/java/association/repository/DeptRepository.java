package association.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import association.model.DepartmentModel;

public interface DeptRepository extends JpaRepository<DepartmentModel, Integer> {

}
