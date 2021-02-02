package com.sswh.platform.demo.ioDemo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.TreeSet;

public class TreeSetUse {

    public static void main(String[] args) {

        TreeSet<Person> personTreeSet = new TreeSet<>((s1, s2) -> {
            // 利用二叉树的思想，大的放在右边这样当s1 > s2 的时候返回1：放在右边，就是从小到大排
            // 返回-1的时候放在左边，就是把左边元素放左边，这样就是从大到小排序。
            // 返回0的时候后续不再增加
            if (s1.hobby.length() > s2.hobby.length()) {
                return -1;
            } else {
                return 1;
            }
        });

        Person person = new Person("zhang", "basketball");
        personTreeSet.add(person);

        Person person2 = new Person("li", "basketball,football,pingpong");
        personTreeSet.add(person2);

        Person person1 = new Person("wang", "basketball,football");
        personTreeSet.add(person1);

        for (Person person0 : personTreeSet) {
            System.out.println(person0.toString());
        }


    }

    @Data
    @AllArgsConstructor
    static class Person {
        String name;
        String hobby;
    }

}
