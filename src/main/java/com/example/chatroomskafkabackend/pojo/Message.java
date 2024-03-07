package com.example.chatroomskafkabackend.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Message {
    private String username;
    private String message;
    private String timestamp;
    private String chatRoomName;

    public Message(String username, String message, String chatRoomName) {
        this.username = username;
        this.message = message;
        this.timestamp = String.valueOf(System.currentTimeMillis());
        this.chatRoomName = chatRoomName;
    }
}
