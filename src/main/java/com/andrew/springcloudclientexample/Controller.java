package com.andrew.springcloudclientexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class Controller {

    Logger logger = LoggerFactory.getLogger(Controller.class);

    private final RabbitmqSenderService rabbitmqService;

    @Value("${msg:Can not found message server not responding}")
    private String msg;

    public Controller(RabbitmqSenderService rabbitmqService) {
        this.rabbitmqService = rabbitmqService;
    }

    @GetMapping("/hello")
    public String hello() {
        return this.msg;
    }

    @GetMapping("/sent")
    public String chat() throws InterruptedException {
        rabbitmqService.sendMessage("Hello from RabbitMQ!");
        return "Sent";
    }

}