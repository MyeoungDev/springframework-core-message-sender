package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;

public class MessageSenderService {

    private MessageSender messageSender;

//    public MessageSenderService(MessageSender messageSender) {
//        this.messageSender = messageSender;
//    }

    public MessageSenderService() {

    }

    public void setEmailMessageSender(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void send() {
        messageSender.sendMessage(new User("test@test", "010"), "message");
    }
}
