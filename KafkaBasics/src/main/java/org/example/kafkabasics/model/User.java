package org.example.kafkabasics.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String username;
    private String email;
}
