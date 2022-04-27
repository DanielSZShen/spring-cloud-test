package com.example.feign.controller;

import com.example.feign.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: shensh
 * @date: 2022/4/26 20:01
 * @version: v1.0
 */
@RestController
public class ApiController {
    @Autowired
    private ApiService apiService;

    @GetMapping("/index")
    public String index(){
        return apiService.index();
    }
}
