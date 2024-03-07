package com.example.chatroomskafkabackend.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class KafkaProducerService {

    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message, String topicName) {
        log.info("Message Sent: {}", message);
        this.kafkaTemplate.send(topicName, message);
    }

}
