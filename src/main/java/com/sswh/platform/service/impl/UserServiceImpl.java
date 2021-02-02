package com.sswh.platform.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sswh.platform.entity.po.User;
import com.sswh.platform.mapper.UserMapper;
import com.sswh.platform.service.UserService;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

        public void test() {
            // 创建一个文件的方法
            File file = new File("");
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
