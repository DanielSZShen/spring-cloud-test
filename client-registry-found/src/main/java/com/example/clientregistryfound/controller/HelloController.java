package com.example.clientregistryfound.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: shensh
 * @date: 2022/4/26 14:32
 * @version: v1.0
 */
@RestController
public class HelloController {
    @Value("${server.port}")
    private int port;

    @GetMapping("/index")
    public String index(){
        return "Hello World,i am from port:"+port;
    }
}
