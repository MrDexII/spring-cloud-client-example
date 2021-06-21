package com.andrew.springcloudclientexample;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;


@Service
public class RabbitmqSenderService {
    private final RabbitTemplate rabbitTemplate;

    public RabbitmqSenderService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessage(String message) {
        rabbitTemplate.convertAndSend(RabbitmqConfig.queueName, message);
    }
}
