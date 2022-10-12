package com.nhnacademy.edu.springframework.messagesender.config;


import com.nhnacademy.edu.springframework.messagesender.service.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.nhnacademy.edu.springframework.messagesender")
public class ServiceConfig {

//    @Autowired
//    private MainConfig mainConfig;
//
//    @Bean
//    public MessageSenderService emailMessageService() {
//        return new MessageSenderService(mainConfig.emailMessageSender());
//    }

//    @Bean
//    public MessageSenderService smsMessageService() {
//        return new MessageSenderService(mainConfig.smsMessageSender());
//    }


}
