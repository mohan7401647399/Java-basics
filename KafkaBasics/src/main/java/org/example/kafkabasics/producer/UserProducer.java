package org.example.kafkabasics.producer;

import lombok.RequiredArgsConstructor;
import org.example.kafkabasics.model.User;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserProducer {

    private final KafkaTemplate<String, User> kafkaTemplate;

    public void sendMessage(User user) {
        kafkaTemplate.send("user-topic", user);
    }
}