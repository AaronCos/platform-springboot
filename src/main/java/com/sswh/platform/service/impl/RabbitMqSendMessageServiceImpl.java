package com.sswh.platform.service.impl;

import com.sswh.platform.service.MqService;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class RabbitMqSendMessageServiceImpl implements MqService {


    private final AmqpAdmin amqpAdmin;
    private final AmqpTemplate amqpTemplate;


    @Autowired
    public RabbitMqSendMessageServiceImpl(AmqpAdmin amqpAdmin, AmqpTemplate amqpTemplate) {
        this.amqpAdmin = amqpAdmin;
        this.amqpTemplate = amqpTemplate;
    }

    public void test(){


    }



}
