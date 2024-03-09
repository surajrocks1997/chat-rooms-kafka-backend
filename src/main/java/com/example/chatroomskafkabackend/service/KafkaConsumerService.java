package com.example.chatroomskafkabackend.service;

import com.example.chatroomskafkabackend.pojo.Message;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@KafkaListener(topics = "testTopic", groupId = "myChatGroupId", containerFactory = "messageConsumerListenerFactory")
@Slf4j
public class KafkaConsumerService {

    WebSocketSubscribersService subscribersService;

    @KafkaHandler
    public void consumeChatRoomMessages(Message message) {
        log.info("FROM Kafka Consumer Service - MESSAGE OBJECT: {}", message);
        subscribersService.sendToSubscriber(message, message.getChatRoomName());

    }

    @KafkaHandler(isDefault = true)
    public void handleMessage(Object message) {
        log.info("FROM Kafka Consumer Service - DEFAULT Kafka Handler: {}", message.toString());
    }
}
