package com.sswh.platform.controller;

import com.sswh.platform.entity.po.User;
import com.sswh.platform.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Calendar;

@RestController
public class OprDataBaseController {

    @Resource
    UserService userService;

    @RequestMapping("hello")
    public String addOne(HttpSession session){
        session.setAttribute("name","wangchengcheng");
        User user = new User();
        user.setUsername("wangyuzhi");
        user.setBirthday(Calendar.getInstance().getTime());
        user.setName("利");
        boolean save = userService.save(user);
        return "success";
    }
}
