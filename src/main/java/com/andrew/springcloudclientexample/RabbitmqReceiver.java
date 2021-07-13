package com.andrew.springcloudclientexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitmqReceiver {
    Logger logger = LoggerFactory.getLogger(RabbitmqReceiver.class);

    @RabbitListener(queues = RabbitmqConfig.QUEUE_NAME)
    public void receive(String in) {
        logger.info("1 Received '" + in + "'");
    }

}