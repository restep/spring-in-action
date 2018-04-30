package com.ch02.autoconfig.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * ComponentScan 这个注解能够在Spring中启用组件扫描
 * 如果没有其他配置的话 @ComponentScan默认会扫描与配置类相同的包
 * 因为CDPlayerConfig类位于autoconfig包中
 * 因此Spring将会扫描这个包以及这个包下的所有子包 查找带有@Component注解的类
 * @author restep
 * @date 2018/4/29
 */
@Configuration
@ComponentScan(basePackages = {"com.ch02.autoconfig"})
public class CdPlayerConfig {

}
