package com.example.feign.clients;

import com.example.feign.config.FeignConfiguration;
import com.example.feign.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// 配置加载此处，只对userservice有效
@FeignClient(value = "userservice", configuration = FeignConfiguration.class)
public interface UserClient {

    @GetMapping("/user/{id}")
    User findById(@PathVariable("id") Long id);
}
