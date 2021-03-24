package com.sswh.platform.demo.guavaDemo;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;

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

    }
}
