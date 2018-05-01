package com.ch04.config;

import com.ch04.audience.AudienceNew;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * EnableAspectJAutoProxy 启动AspectJ自动代理
 * @author restep
 * @date 2018/5/1
 */
@Configuration
@EnableAspectJAutoProxy
public class AudienceConfig {
    @Bean
    public AudienceNew getAudienceNew() {
        return new AudienceNew();
    }
}
