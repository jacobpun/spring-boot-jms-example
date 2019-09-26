package com.pk.jms.service;

import com.pk.jms.model.Task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

/**
 * MessagingService
 */
@Service
public class MessageSender {
    @Autowired JmsTemplate jms;

    public void sendTask(Task task) {
        this.jms.send(session -> session.createObjectMessage(task));
    }

    public void convertAndSendTask(Task task) {
        this.jms.convertAndSend(task);
    }
    
}