package com.sicpa.kafkaproject.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


@Component
public class KafkaListeners {
  @KafkaListener(topics = "FirstTopic",groupId = "abdem")
    void Listener(String data){
    System.out.println("Listenre recieved : "+data );

    }
}
