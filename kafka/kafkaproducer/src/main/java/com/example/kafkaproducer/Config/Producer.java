package com.example.kafkaproducer.Config;

import com.example.kafkaproducer.model.HighSchool;
import com.example.kafkaproducer.model.School;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;


@Service
public class Producer {

    private String topicName = "topic1";

    // about String transfer...........................


//    @Autowired
//    private KafkaTemplate<String, String> kafkaTemplate;


//    public void sendMessage(String message) {
//        kafkaTemplate.send(topicName, message);
//    }


    // about object transfer...........................

 @Autowired
   // private KafkaTemplate<String, School> kafkaTemplate;

  private KafkaTemplate<String, ?> kafkaTemplate;
    public void sendMessage(School school){
        Message<School> message= MessageBuilder
                .withPayload(school)
                .setHeader(KafkaHeaders.TOPIC,topicName)
                .build();
        kafkaTemplate.send(message);

    }


    public void sendMessage1(HighSchool highSchool){
        Message<HighSchool> message= MessageBuilder
                .withPayload(highSchool)
                .setHeader(KafkaHeaders.TOPIC,topicName)
                .build();
        kafkaTemplate.send(message);

    }




}


