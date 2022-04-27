package com.example.feign.service;

import com.example.feign.service.impl.ApiServiceError;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @description:
 * @author: shensh
 * @date: 2022/4/26 19:29
 * @version: v1.0
 */
@FeignClient(value = "eurekaclient",fallback = ApiServiceError.class)
public interface ApiService {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    String index();

}
