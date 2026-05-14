package org.example.testproject_05032026.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String name;
    private int age;

    public UserModel() {
    }

    public UserModel(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
    }

}
