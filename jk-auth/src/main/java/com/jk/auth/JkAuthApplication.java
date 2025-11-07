package com.jk.auth;

import com.jk.common.feign.annotation.EnableJkFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 16610
 */
@EnableJkFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class JkAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(JkAuthApplication.class, args);
    }

}
