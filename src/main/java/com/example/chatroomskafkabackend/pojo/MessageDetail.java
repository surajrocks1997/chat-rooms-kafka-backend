package com.example.chatroomskafkabackend.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageDetail {
    private String timestamp;
    private String chatRoomName;

    public MessageDetail(@JsonProperty("chatRoomName") String chatRoomName) {

        this.timestamp = String.valueOf(System.currentTimeMillis());
        this.chatRoomName = chatRoomName;
    }

    @Override
    public String toString() {
        return "MessageDetail{" +
                "timestamp='" + timestamp + '\'' +
                ", chatRoomName='" + chatRoomName + '\'' +
                '}';
    }
}
