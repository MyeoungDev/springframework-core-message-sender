package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.service.MessageSenderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/beans.xml");

        MessageSenderService messageSenderService = context.getBean("messageSenderService", MessageSenderService.class);
        messageSenderService.send();
    }
}
