package com.nhnacademy.edu.springframework.messagesender.xml;

import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSenderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlMain {
    public static void main(String[] args) {
        String location = "classpath:/beans.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(location);

//        MessageSender emailMessageSender = context.getBean("EmailMessageSender", MessageSender.class);
//        MessageSender smsMessageSender = context.getBean("SmsMessageSender", MessageSender.class);


        new MessageSenderService(context.getBean("EmailMessageSender", MessageSender.class)).send();
        System.out.println("---------------");
        new MessageSenderService(context.getBean("EmailMessageSender", MessageSender.class)).send();

        System.out.println("---------------");
        new MessageSenderService(context.getBean("SmsMessageSender", MessageSender.class)).send();
        System.out.println("---------------");
        new MessageSenderService(context.getBean("SmsMessageSender", MessageSender.class)).send();

//        emailMessageSender.sendMessage(new User("test", "010"),"mesage");
//        smsMessageSender.sendMessage(new User("test", "010"), "message");

    }

}
