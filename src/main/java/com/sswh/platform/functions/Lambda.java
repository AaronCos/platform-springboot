package com.sswh.platform.functions;

import com.sswh.platform.entity.po.User;

@FunctionalInterface
interface Print<T> {
    void draw(T t);
}
public class Lambda {

    public static void main(String[] args) {
        drawImage((x) -> {
            System.out.println("hello world2");
        });
        addUser(user -> {
            System.out.println(user.getName());
        });
        sing((x) -> {
            System.out.println("二曲相似");
        });
        sing(new Print<String>() {
            @Override
            public void draw(String s) {
                System.out.println(s);
            }
        });
        /**
         * 1.1 进化开始
         */
        danceCount(5, (x) -> {
            System.out.println(x);
        });
        // 1.2 只有一个语句可以去掉括号
        danceCount(5, (x) ->
            System.out.println(x)
        );
        // 1.3 如果只有对输入的操作，入参都不用写了，对输入参数直接打印
        danceCount(5, System.out::print);

    }
    public static void drawImage(Print<String> images){
       images.draw("hello world");
    }

    public static void addUser(Print<User> users) {
        User user = new User();
        user.setName("wang_chengcheng");
        users.draw(user);
    }
    public static void sing(Print<String> songs) {
        songs.draw("一曲相思");
    }
    // 写到这里依然没啥感觉，接着写5个看看
    // dance
    public static void danceCount(Integer count, Print<Integer> dance){
        dance.draw(count);
    }

}
