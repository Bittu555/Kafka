package com.example.kafkconsumer2.lis;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer2 {
    @KafkaListener(topics = "topic1", groupId = "group1")
    public void consume(String message) {

        System.out.println(message);
    }
}
