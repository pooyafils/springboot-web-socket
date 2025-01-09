package com.example.websocket;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    public void sendMessageToTopic(String topic, String message) {
        messagingTemplate.convertAndSend("/topic/" + topic, message);
    }
}