package com.example.chatroomskafkabackend.service;

import com.example.chatroomskafkabackend.pojo.Message;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducerService {

    @Value("${myTopic.name}")
    private String topicName;

    private final KafkaTemplate<String, Message> kafkaTemplate;

    public void sendMessage(Message message) {
        log.info("FROM Kafka Producer Service: {}", message);
        this.kafkaTemplate.send(topicName, message);
    }

}
