package com.example.demo2;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class AppController {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @GetMapping("/cheerup")
    public String getMethodName2() {
        return "push 확인1234";
    }

    @GetMapping("/hello") 
    public String getMethodName1() {
        return "안녕~";
    }
    

    @GetMapping("/redis")
    public String redisMethod() {
        redisTemplate.opsForValue().set("abc", "Hello World");
        return "redis";
    }

    @GetMapping("/")
    public String getMethodName() {
        return "hello world";
    }
    

}
