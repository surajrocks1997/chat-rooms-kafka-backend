package com.example.chatroomskafkabackend.service;

import com.example.chatroomskafkabackend.pojo.Message;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class KafkaProducerService {

    KafkaTemplate<String, Message> kafkaTemplate;

    public void sendMessage(String topicName, Message message) {
        log.info("Message Sent: {}", message);
        this.kafkaTemplate.send(topicName, message);
    }

}
