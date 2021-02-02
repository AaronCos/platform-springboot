package com.sswh.platform.methodtest;

import com.alibaba.fastjson.JSONArray;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTest {

    // 1. 除法
    @Test
    public void testMultiply(){
        BigDecimal num1 = new BigDecimal("10.01");
        BigDecimal num2 = new BigDecimal("10.01");
        BigDecimal multiply = num1.multiply(num2);
        System.out.println(multiply); // 100.2001

    }
    @Test
    public void test(){
        BigDecimal dec = new BigDecimal("-2.4");
        BigDecimal ten = new BigDecimal("10");
        BigDecimal divide = dec.divide(ten, 0, RoundingMode.FLOOR);
        System.out.println(divide.toString());
        BigDecimal dec1 = new BigDecimal("-2.6");
        BigDecimal ten1 = new BigDecimal("10");
        BigDecimal divide1 = dec1.divide(ten, 0, RoundingMode.FLOOR);
        System.out.println(divide1.toString());

    }


    @Test
    public void test1() {

        JSONArray objects = null;
        System.out.println(objects.isEmpty());
    }



}
