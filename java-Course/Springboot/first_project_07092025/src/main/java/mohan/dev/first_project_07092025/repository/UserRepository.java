package mohan.dev.first_project_07092025.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mohan.dev.first_project_07092025.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
	
}
