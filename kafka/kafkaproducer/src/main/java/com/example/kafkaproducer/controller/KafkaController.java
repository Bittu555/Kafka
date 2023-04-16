package com.example.kafkaproducer.controller;


import com.example.kafkaproducer.Config.Producer;
import com.example.kafkaproducer.model.HighSchool;
import com.example.kafkaproducer.model.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    Producer kafkaProducer;

//    @GetMapping("/produce/{message}")
//    public ResponseEntity<String> publishMessage(@PathVariable("message") String message){
//
//        kafkaProducer.sendMessage(message);
//
//     return ResponseEntity.ok("Message sent");
//    }


    @PostMapping("/school")
    public ResponseEntity<String> publishMessage(@RequestBody School school) {
        kafkaProducer.sendMessage(school);
        return ResponseEntity.ok("Message sent");

    }

    @PostMapping("/highschool")
    public ResponseEntity<String> publishMessage(@RequestBody HighSchool highSchool) {
        kafkaProducer.sendMessage1(highSchool);
        return ResponseEntity.ok("Message sent");

    }


}
