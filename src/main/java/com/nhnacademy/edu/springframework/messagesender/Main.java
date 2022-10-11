package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.service.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSenderService;
import com.nhnacademy.edu.springframework.messagesender.service.SmsMessageSender;

public class Main {
    public static void main(String[] args) {
        new MessageSenderService(new EmailMessageSender()).send();
        new MessageSenderService(new SmsMessageSender()).send();
    }
}
