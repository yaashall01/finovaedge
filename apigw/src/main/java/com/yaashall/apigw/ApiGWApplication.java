package com.yaashall.apigw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *
 * @author: Yassine CHALH / yassinechalh9@gmail.com
 */

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGWApplication{
    public static void main(String[] args) {

        SpringApplication.run(ApiGWApplication.class, args);
    }
}
