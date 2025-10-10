package association.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import association.model.CourseModel;

@Repository
public interface CourseRepository extends JpaRepository<CourseModel, Integer> {

}
