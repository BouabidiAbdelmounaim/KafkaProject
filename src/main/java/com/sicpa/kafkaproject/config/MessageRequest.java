package com.sicpa.kafkaproject.config;

import com.fasterxml.jackson.annotation.JsonProperty;


public class MessageRequest {
    String message ;

    public MessageRequest() {
    }

    public MessageRequest(String message) {
        this.message= message ;
    }

}
