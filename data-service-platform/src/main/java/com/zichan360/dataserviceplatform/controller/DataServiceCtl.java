package com.zichan360.dataserviceplatform.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * DataServiceCtl
 *
 * @desc: 数服测试类
 * @author: sunweihong
 * @date: 2020/4/25 11:00
 **/
@RestController
public class DataServiceCtl {
    @Resource
    private RestTemplate restTemplate;

    @RequestMapping(value = "/echo/{str}", method = RequestMethod.GET)
    public String echo(@PathVariable String str) {
        return restTemplate.getForObject("http://permission-center/echo/" + str, String.class);
    }
}
