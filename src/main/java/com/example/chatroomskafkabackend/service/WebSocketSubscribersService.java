package com.example.chatroomskafkabackend.service;

import com.example.chatroomskafkabackend.pojo.Message;
import lombok.AllArgsConstructor;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class WebSocketSubscribersService {

    private final SimpMessageSendingOperations messageTemplate;

    public void sendToSubscriber(Message message, String chatRoomName) {
        this.messageTemplate.convertAndSend("/topic/chatRoom/" + chatRoomName, message);
    }
}
