package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.annotation.SMS;
import com.nhnacademy.edu.springframework.messagesender.aop.Auditable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MessageSenderService {

    private final MessageSender messageSender;

    @Value("${from}")
    private String from;

    //    @SMS
    public MessageSenderService(@SMS("smsMessageSender") MessageSender messageSender) {
        this.messageSender = messageSender;
//        this.from = from;
    }

    @Auditable("")
    public void send() {
        System.out.println("from : " + from);
        messageSender.sendMessage(new User("test@test", "010"), "message");
    }
}
