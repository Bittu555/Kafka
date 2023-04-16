package com.example.kafkaproducer.Config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicConfig {

    private String topicName="topic1";



    @Bean
    public NewTopic topic(){

        return TopicBuilder.name(topicName)
                .partitions(1)
                .replicas(1)
                .build();
    }




}
