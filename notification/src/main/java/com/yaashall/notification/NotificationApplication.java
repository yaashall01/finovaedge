package com.yaashall.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Yassine CHALH
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(
        basePackages = "com.yaashall.notification"
)
public class NotificationApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(NotificationApplication.class);
    }
}
