package com.andrew.springcloudclientexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@RabbitListener(queues = "chat")
public class RabbitmqReceiver {
    Logger logger = LoggerFactory.getLogger(RabbitmqReceiver.class);

    @RabbitHandler
    public void receive(String in) {
        logger.info("Received '" + in + "'");
    }

}