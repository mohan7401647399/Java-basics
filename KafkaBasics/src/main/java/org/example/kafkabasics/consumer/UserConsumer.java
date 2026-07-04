package org.example.kafkabasics.consumer;

import org.example.kafkabasics.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class UserConsumer {

    @KafkaListener(topics = "user-topic", groupId = "user-group")
    public void consume(User user) {
        System.out.println("Consumed message: " + user);
    }
}