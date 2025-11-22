package ems.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ems.entity.UserEntity;

@Repository  // Marks this interface as a Spring bean for database operations
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    // Finds a user by username. Returns Optional because user may or may not exist.
    Optional<UserEntity> findByUsername(String username);

    // Checks if a username already exists in the database (useful for validation)
    Boolean existsByUsername(String username);

    // Checks if an email already exists in the database (useful for validation)
    Boolean existsByEmail(String email);
}