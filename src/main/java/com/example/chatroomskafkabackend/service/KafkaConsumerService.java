package com.example.chatroomskafkabackend.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

//@Service
//@Slf4j
//public class KafkaConsumerService {
//
////    to work on kafka topics listener. incomplete code
//    @KafkaListener(topics = {"testTopic"}, groupId = "")
//    public void consume(String message) {
//        log.info("Message: {}", message);
//    }
//}
