package com.sswh.platform.demo.mqDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.stereotype.Component;

@Component
public class Customer1 {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @RabbitHandler
    public void process(String message) {
        log.info("接收消息1:{}", message);
    }
}
