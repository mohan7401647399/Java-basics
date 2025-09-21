package springboot.CRUD_19092025.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import springboot.CRUD_19092025.model.UserModel;

@Repository
public interface UserRepo extends JpaRepository<UserModel, Integer> {
	List<UserModel> findByTechnology(String technology);

	@Query(nativeQuery = true, value = "select * from user_model where name =:name and technology =:technology")
	List<UserModel> findByNameAndTechnology(@Param("name") String name, @Param("technology") String technology);
}
