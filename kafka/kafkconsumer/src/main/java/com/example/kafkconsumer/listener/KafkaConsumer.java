package com.example.kafkconsumer.listener;

import com.example.kafkconsumer.model.School;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "topic1", groupId = "group1")
    public void consume(String message) {

        System.out.println(message);

//        ObjectMapper mapper = new ObjectMapper();
//        try {
//             School school = mapper.readValue(message, School.class);
//
//            System.out.println(school.getSchoolName());
//            System.out.println(school.getLocation());
//        }catch (Exception e) {
//            e.printStackTrace();
//        }


    }
}
