package org.example.testproject_05032026.Repository;

import org.example.testproject_05032026.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserModel, Integer> {
}
