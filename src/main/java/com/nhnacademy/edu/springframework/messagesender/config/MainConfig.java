package com.nhnacademy.edu.springframework.messagesender.config;

import com.nhnacademy.edu.springframework.messagesender.service.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.SmsMessageSender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.nhnacademy.edu.springframework.messagesender")
@PropertySource("classpath:/greeter.properties")
public class MainConfig {

//    @Bean
//    public MessageSender emailMessageSender() {
//        return new EmailMessageSender();
//    }
//
//    @Bean
//    public MessageSender smsMessageSender() {
//        return new SmsMessageSender();
//    }
}
