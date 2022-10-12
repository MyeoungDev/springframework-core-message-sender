package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.annotation.SMS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

public class MessageSenderService {

    private final MessageSender messageSender;
    private final String from;

//    @SMS
    public MessageSenderService(@SMS("smsMessageSender") MessageSender messageSender,
                                @Value("${from}") String from) {
        this.messageSender = messageSender;
        this.from = from;
    }
    public void send() {
        System.out.println("from : " + from);
        messageSender.sendMessage(new User("test@test", "010"), "message");
    }
}
