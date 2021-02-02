package com.sswh.platform.util;



import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class RabbitMqUtil {

    private static ConnectionFactory factory;

    //程序一加载就会启动
    static {
        //1.创建连接工厂对象
        factory=new ConnectionFactory();
        //设置连接对象的参数
        factory.setHost("192.168.117.130");
        factory.setPort(15672);
        factory.setUsername("guest");
        factory.setPassword("guest");
        factory.setVirtualHost("/");
    }




}
