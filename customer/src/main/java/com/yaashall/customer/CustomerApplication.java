package com.yaashall.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Yassine CHALH
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(
        basePackages = "com.yaashall.clients"
)
public class CustomerApplication {
    public static void main(String[] args) {

        SpringApplication.run(CustomerApplication.class, args);

    }
}
