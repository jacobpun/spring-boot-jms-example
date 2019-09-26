package com.pk.jms.controller;

import com.pk.jms.model.Task;
import com.pk.jms.service.MessageSender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * MessageController
 */
@RestController
@RequestMapping("/messages")
public class MessageController {

    @Autowired
    private MessageSender sender;

    @PostMapping("send")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void send(@RequestBody Task task) {
        this.sender.sendTask(task);
    }

    @PostMapping("convert-send")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    // curl -d '{"id": 1, "name": "task1"}' -H 'content-type: application/json' -X
    // POST http://localhost:8080/messages/convert-send
    public void convertAndSend(@RequestBody Task task) {
        this.sender.convertAndSendTask(task);
    }
}