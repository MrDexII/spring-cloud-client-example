package com.andrew.springcloudclientexample;

import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;


@Service
public class RabbitmqSenderService {
    private final RabbitTemplate rabbitTemplate;
    private final FanoutExchange fanoutExchange;

    public RabbitmqSenderService(RabbitTemplate rabbitTemplate, FanoutExchange fanoutExchange) {
        this.rabbitTemplate = rabbitTemplate;
        this.fanoutExchange = fanoutExchange;
    }

    public void sendMessage(String message) {
        rabbitTemplate.convertAndSend(fanoutExchange.getName(), "", message);
    }
}
