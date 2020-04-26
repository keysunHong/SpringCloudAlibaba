package com.zichan360.dataserviceplatform.controller;

import org.springframework.cloud.openfeign.FeignClient;
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
@FeignClient(value = "permission-center")
@RestController
public interface DataServiceCtl {

    @RequestMapping(value = "/echo/{str}", method = RequestMethod.GET)
    String echo(@PathVariable String str) ;
}
