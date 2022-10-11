package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;

public class MessageSenderService {

    private final MessageSender messageSender;

    public MessageSenderService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void send() {
        messageSender.sendMessage(new User("test@test", "010"), "message");
    }
}
