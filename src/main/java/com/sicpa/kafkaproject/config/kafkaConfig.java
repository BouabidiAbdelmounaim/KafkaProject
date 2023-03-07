package com.sicpa.kafkaproject.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class kafkaConfig {
    //  this class will be responsible for creating topics same thing as message or anything else
    @Bean
     NewTopic sicpaTopic() {
        System.out.println("test 1");
        return TopicBuilder.name("AbdemTopic").
                build();
    }
   /* @Bean
    NewTopic sicpaTopicSecpnd() {
        System.out.println("test 2 ");

        return TopicBuilder.name("AbdemTopic_second ").
                build();
    }*/
}