package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class MessageSenderServiceTest {

    @InjectMocks
    private MessageSenderService messageSenderService;

    @Mock
    private MessageSender messageSender;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testMessageSender() {

        User user = new User("testEmail", "testNumber");
        MessageSender mock = Mockito.mock(MessageSender.class);
        MessageSenderService messageSenderService = new MessageSenderService();
        messageSenderService.setMessageSender(mock);
        Mockito.when(mock.sendMessage(user, "test")).thenReturn(false);
        boolean result = messageSenderService.sendMessage(user, "testMsg");
        Assertions.assertThat(result).isEqualTo(false);
    }

}