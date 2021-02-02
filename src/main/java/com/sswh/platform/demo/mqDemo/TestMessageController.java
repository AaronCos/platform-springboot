package com.sswh.platform.demo.mqDemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("message")
public class TestMessageController {

    private final Provider sendMsgService;

    @Autowired
    public TestMessageController(Provider sendMsgService) {
        this.sendMsgService = sendMsgService;
    }

    @RequestMapping("send")
    public String sendMessage() {
        sendMsgService.sendMsg();
        return "成功发送了";
    }

}
