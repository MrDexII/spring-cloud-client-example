package com.andrew.springcloudclientexample;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitmqConfig {

    public static final String queueName = "chat";

    @Bean
    public Queue queue() {
        return new Queue(queueName);
    }

    @Bean
    public RabbitmqReceiver receiver(){
        return new RabbitmqReceiver();
    }
}
