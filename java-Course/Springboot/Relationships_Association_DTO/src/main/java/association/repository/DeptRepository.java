package association.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import association.model.DepartmentModel;

@Repository
public interface DeptRepository extends JpaRepository<DepartmentModel, Integer> {

}
