package com.example.chatroomskafkabackend.pojo;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    private String username;
    private String message;
    private String timestamp;
    private String chatRoomName;

    @Override
    public String toString() {
        return "Message{" +
                "username='" + username + '\'' +
                ", message='" + message + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", chatRoomName='" + chatRoomName + '\'' +
                '}';
    }
}