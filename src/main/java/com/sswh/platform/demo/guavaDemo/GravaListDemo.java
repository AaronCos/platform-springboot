package com.sswh.platform.demo.guavaDemo;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.sswh.platform.entity.po.User;

import java.util.ArrayList;
import java.util.List;

public class GravaListDemo {

    public static void main(String[] args) {
        List<Integer> integers = Ints.asList(1, 3, 4, 5, 6, 8);
        int[] intArray1 = {1,2,3};
        int[] intArray2 = {4,5,6};
        String join = Ints.join(",", intArray1);
        String s = Preconditions.checkNotNull(join);
        System.out.println(s);
        int hello[] = {1,3,45,56,6};

        System.out.println("max:"+Ints.max(hello));
        System.out.println("min:"+Ints.min(hello));
        System.out.println("contains:"+ Ints.contains(hello, 3));
        System.out.println("list->array:"+Ints.toArray(integers));
        System.out.println("array1+array2"+Ints.concat(intArray1,intArray2));
        List<User> userArrayList = new ArrayList<User>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setUsername("g" + i);
            user.setName("gggg"+i);
            user.setIid("hhhhhh"+i);
            userArrayList.add(user);
        }
        System.out.println(userArrayList);
        sub(userArrayList);
        System.out.println(userArrayList);

    }

    public static void sub(List<User> userArrayList){
        userArrayList.get(0).setUsername("hello world");
    }
}
