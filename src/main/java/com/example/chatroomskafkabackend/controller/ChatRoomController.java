package com.example.chatroomskafkabackend.controller;

import com.example.chatroomskafkabackend.pojo.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
@Slf4j
public class ChatRoomController {

    @MessageMapping("/chatRoom/{chatRoomName}")
    @SendTo("/topic/{chatRoomName}")
    public Message getMessage(@Payload Message message, @DestinationVariable String chatRoomName) {
        return message;
    }
}
