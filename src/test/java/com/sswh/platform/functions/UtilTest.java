package com.sswh.platform.functions;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;

public class UtilTest {

    @Test
    public void test(){
        String a = "15";
        String concat = a.concat("%");

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
}
