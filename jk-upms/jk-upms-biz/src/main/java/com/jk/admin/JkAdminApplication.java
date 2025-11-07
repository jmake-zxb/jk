package com.jk.admin;


import com.jk.common.feign.annotation.EnableJkFeignClients;
import com.jk.common.security.annotation.EnableJkResourceServer;
import com.jk.common.swagger.annotation.EnableJkDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 用户统一管理系统
 *
 * @author 1661
 * @date 2025/05/30
 */
@EnableJkDoc(value = "admin")
@EnableJkFeignClients
@EnableJkResourceServer
@EnableDiscoveryClient
@SpringBootApplication
public class JkAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(JkAdminApplication.class, args);
	}

}
