package com.sswh.platform.demo.jsonconvert;

import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Map;

public class JsonObjectConvert {
    @Resource
    RestTemplate restTemplate;


    public void test() {
        Map requestBody = null;
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON_UTF8);
        HttpEntity<Object> request = new HttpEntity<>(requestBody, httpHeaders);
        restTemplate.postForObject("url",request, String.class);
        }



}
