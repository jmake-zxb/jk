package com.jk.common.feign;

import com.alibaba.cloud.sentinel.feign.SentinelFeignAutoConfiguration;
import com.jk.common.feign.core.JkFeignInnerRequestInterceptor;
import com.jk.common.feign.core.JkFeignRequestCloseInterceptor;
import com.jk.common.feign.sentinel.ext.JkSentinelFeign;
import feign.Feign;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.openfeign.JkFeignClientsRegistrar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

/**
 * Sentinel Feign 自动配置类
 *
 * @author 16610
 */
@Configuration(proxyBeanMethods = false)
@Import(JkFeignClientsRegistrar.class)
@AutoConfigureBefore(SentinelFeignAutoConfiguration.class)
public class JkFeignAutoConfiguration {

    /**
     * 创建Feign.Builder实例，支持Sentinel功能
     *
     * @return Feign.Builder实例
     * @ConditionalOnMissingBean 当容器中不存在该类型bean时创建
     * @ConditionalOnProperty 当配置feign.sentinel.enabled为true时生效
     * @Scope 指定bean作用域为prototype
     */
    @Bean
    @Scope("prototype")
    @ConditionalOnMissingBean
    @ConditionalOnProperty(name = "feign.sentinel.enabled")
    public Feign.Builder feignSentinelBuilder() {
        return JkSentinelFeign.builder();
    }

    /**
     * 创建并返回JkFeignRequestCloseInterceptor实例
     *
     * @return JkFeignRequestCloseInterceptor实例
     */
    @Bean
    public JkFeignRequestCloseInterceptor jkFeignRequestCloseInterceptor() {
        return new JkFeignRequestCloseInterceptor();
    }

    /**
     * 创建并返回JkFeignInnerRequestInterceptor实例
     *
     * @return JkFeignInnerRequestInterceptor 内部请求拦截器实例
     */
    @Bean
    public JkFeignInnerRequestInterceptor jkFeignInnerRequestInterceptor() {
        return new JkFeignInnerRequestInterceptor();
    }

}