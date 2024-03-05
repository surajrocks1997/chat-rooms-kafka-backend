package com.example.chatroomskafkabackend.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Message {
    private String username;
    private String message;
    private MessageDetail details;

    @Override
    public String toString() {
        return "Message{" +
                "username='" + username + '\'' +
                ", message='" + message + '\'' +
                ", details=" + details.toString() +
                '}';
    }
}
