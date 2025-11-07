package com.jk;


import com.jk.common.security.annotation.EnableJkResourceServer;
import com.jk.common.swagger.annotation.EnableJkDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 单体版本启动器，运行此模块即可启动整个系统
 *
 * @author 1661
 */
@SpringBootApplication
@EnableJkResourceServer
@EnableJkDoc(value = "admin", isMicro = false)
public class JkBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(JkBootApplication.class, args);
	}

}
