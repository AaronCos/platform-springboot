package com.sswh.platform.controller;

import com.sswh.platform.entity.po.User;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OprLambdaList {


    public static void main(String[] args) {
        testMap();
    }
    public static void testMap(){
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            User user = new User();
            user.setUsername("wang" + Math.random());
            user.setName("good" + Math.random());
            users.add(user);
        }
        Stream<User> stream = users.stream();
        System.err.println(users.stream().count());;
        Map<String, User> collect = users.stream().collect(Collectors.toMap(User::getName, user -> user));

        // 解决重复key
        Map<String, User> collect1 = users.stream().collect(Collectors.toMap(User::getName, user -> user, (key1, key2) -> key2));
        // 指定一个Map的具体实现
        Map<String, User> collect2 = users.stream().collect(Collectors.toMap(User::getName, user -> user, (key1, key2) -> key2, LinkedHashMap::new));
        System.out.println("----------");
        users.stream().map(user -> user).forEach(user -> System.out.println(user.getName()));
        String collect3 = users.stream().map(user -> user.getUsername() + "gggg").collect(Collectors.joining("&"));
        System.out.println(collect3);
    }
}
