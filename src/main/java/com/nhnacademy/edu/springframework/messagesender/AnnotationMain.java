package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSenderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMain {

    public static void main(String[] args) {

        String basePackage = "com.nhnacademy.edu.springframework.messagesender";
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(basePackage);


        User user = new User("email@naver.com", "010-1234-5678");
//        MessageSender emailMessageSender = context.getBean("emailMessageSender", MessageSender.class);
//        MessageSender smsMessageSender = context.getBean("smsMessageSender", MessageSender.class);
//
//        emailMessageSender.sendMessage(new User("email@naver.com", "010-1234-5678"), "emailTest");
//        smsMessageSender.sendMessage(new User("email@naver.com", "010-1234-5678"), "smsTest");
//
//
//        System.out.println("-------------------------------");

        context.getBean("messageSenderService", MessageSenderService.class).sendMessage(user, "test");

    }
}
