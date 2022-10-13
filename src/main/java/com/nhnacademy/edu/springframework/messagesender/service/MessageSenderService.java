package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.annotation.SMS;
import com.nhnacademy.edu.springframework.messagesender.aop.Auditable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MessageSenderService {

    @Autowired
    @Qualifier("emailMessageSender")
    private MessageSender messageSender;

    @Value("${from}")
    private String from;

    //    @SMS
//    public MessageSenderService(@SMS("smsMessageSender") MessageSender messageSender) {
//        this.messageSender = messageSender;
////        this.from = from;
//    }

//    public MessageSenderService(@Qualifier("emailMessageSender") MessageSender messageSender) {
//        this.messageSender = messageSender;
//    }

    public void setMessageSender(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    @Auditable("")
    public boolean sendMessage(User user, String message) {
        System.out.println("from : " + from);
        return this.messageSender.sendMessage(user, message);
    }
}
