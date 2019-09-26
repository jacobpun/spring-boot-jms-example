package com.pk.jms.service;

import com.pk.jms.model.Task;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * MessageListener
 */
@Component
public class MessageListener {

    @JmsListener(destination = "${spring.jms.template.default-destination}")
    public void processMessage(Task task) {
        System.out.println("Received: " + task);
    }
}