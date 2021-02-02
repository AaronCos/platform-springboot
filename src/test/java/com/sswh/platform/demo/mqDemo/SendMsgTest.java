package com.sswh.platform.demo.mqDemo;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SendMsgTest {

    @Resource
    private Provider sendMsgService;

    @Test
    public void test() {
        sendMsgService.sendMsg();
    }
}
