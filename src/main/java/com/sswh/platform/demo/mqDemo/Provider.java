package com.sswh.platform.demo.mqDemo;


import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Scanner;

@Service
public class Provider {


    private final AmqpAdmin amqpAdmin;
    private final AmqpTemplate amqpTemplate;

    @Autowired
    public Provider(AmqpAdmin amqpAdmin, AmqpTemplate amqpTemplate) {
        this.amqpAdmin = amqpAdmin;
        this.amqpTemplate = amqpTemplate;
    }

    public void sendMsg() {
        while (true/*!end.equals(scanner.nextLine())*/) {
            amqpTemplate.convertAndSend("amq.fanout", "", "hello world" + new Date().toString());
        }
    }

}
