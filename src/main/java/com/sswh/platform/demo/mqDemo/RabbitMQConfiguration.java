package com.sswh.platform.demo.mqDemo;


import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfiguration {

    @Bean
    public Queue MessageA() {
        return new Queue("queueA");
    }

    @Bean
    public Queue MessageB() {
        return new Queue("queueB");
    }

    @Bean
    FanoutExchange fanoutExchange() {
        return new FanoutExchange("amq.fanout");
    }

    @Bean
    Binding bindingExchangeA(Queue MessageA, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(MessageA).to(fanoutExchange);
    }

    @Bean
    Binding bindingExchangeB(Queue MessageB, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(MessageB).to(fanoutExchange);
    }


}
