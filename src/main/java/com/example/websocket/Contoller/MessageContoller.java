package com.example.websocket.Contoller;

import com.example.websocket.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageContoller {
    @Autowired
    MessageService messageService;
    @GetMapping
    public ResponseEntity send(){
        messageService.sendMessageToTopic("pooya","hello");
        return ResponseEntity.ok("message send");
    }
}
