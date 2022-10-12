package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class SmsMessageSender implements MessageSender {
    public SmsMessageSender() {
        System.out.println("================= SmsMessageSender create ================");
    }

    public void init() {
        System.out.println("SmsMessageSender initMethod");
    }

    public void cleanUp() {
        System.out.println("SmsMessageSender destroyMethod");
    }


    @Override
    public void sendMessage(User user, String message) {
        System.out.println("SMS Message Sent to " + user.getPhoneNumber() + " " + message);
    }
}
