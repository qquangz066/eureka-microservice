package com.gateway;

import com.gateway.config.RibbonConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

@SpringBootApplication
@EnableEurekaClient
@RibbonClients(defaultConfiguration = RibbonConfiguration.class)
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
