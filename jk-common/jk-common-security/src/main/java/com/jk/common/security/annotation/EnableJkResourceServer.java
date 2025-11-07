package com.jk.common.security.annotation;

import com.jk.common.security.component.JkResourceServerAutoConfiguration;
import com.jk.common.security.component.JkResourceServerConfiguration;
import com.jk.common.security.feign.JkFeignClientConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 启用Jk资源服务器注解
 * <p>
 * 通过导入相关配置类启用Jk资源服务器功能
 *
 * @author 1661
 */

@Documented
@Inherited
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Import({JkResourceServerAutoConfiguration.class, JkResourceServerConfiguration.class,
        JkFeignClientConfiguration.class})
public @interface EnableJkResourceServer {
}
