package com.lcxuan.issues.core.controller;

import com.lcxuan.issues.core.pojo.User;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

@RequestMapping("/issues01")
@RestController
public class TestController {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @PostMapping("test01")
    public Object test01() {
        User user = new User(1001, "张三", LocalDateTime.now());
        redisTemplate.opsForValue().set("issues01:test01", user, 60L, TimeUnit.SECONDS);
        return redisTemplate.opsForValue().get("issues01:test01");
    }
}
