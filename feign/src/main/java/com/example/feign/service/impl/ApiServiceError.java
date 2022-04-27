package com.example.feign.service.impl;

import com.example.feign.service.ApiService;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: shensh
 * @date: 2022/4/26 19:56
 * @version: v1.0
 */
@Component
public class ApiServiceError implements ApiService {

    @Override
    public String index() {
        return "服务器发生故障";
    }
}
