package com.sswh.platform.functions;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;

public class UtilTest {

    @Test
    public void test(){
        Double d = 12312.52131231;
        long round = Math.round(d);
        System.out.println(d.toString());

    }

    @Test
    public void test1() {
        JSONArray obj = null;
        obj.forEach(
                System.out::println
        );
    }

    @Test
    public void test2() {
        JSONObject json = new JSONObject();
        json = null;
        if (json.isEmpty()) {
            System.out.println(json.toJSONString());
        }
    }

    @Test
    public void test3() {
        String ab = "c:e:g";
        String hello = "k";
        String join = Joiner.on("+").skipNulls().join(ab, hello);
        System.out.println(join);
        //Assert.assertEquals(join, "c:d");
    }
}
