package com.example.chatroomskafkabackend.controller;

import com.example.chatroomskafkabackend.pojo.Message;
import com.example.chatroomskafkabackend.service.KafkaProducerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
@Slf4j
public class ChatRoomController {

    private KafkaProducerService service;

    @MessageMapping("/chatRoom/{chatRoomName}")
    public void getMessage(@Payload Message message, @DestinationVariable String chatRoomName) {
        service.sendMessage(chatRoomName, message);
    }
}
