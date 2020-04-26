package com.zichan360.dataserviceplatform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;

/**
 * @author fairy
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class DataServicePlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataServicePlatformApplication.class, args);
    }
}
