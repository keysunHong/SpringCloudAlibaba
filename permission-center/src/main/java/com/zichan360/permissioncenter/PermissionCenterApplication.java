package com.zichan360.permissioncenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author fairy
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PermissionCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(PermissionCenterApplication.class, args);
    }

}
