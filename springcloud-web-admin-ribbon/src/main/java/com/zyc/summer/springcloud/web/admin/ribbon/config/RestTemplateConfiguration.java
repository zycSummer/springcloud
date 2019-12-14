package com.zyc.summer.springcloud.web.admin.ribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfiguration {
    @Bean
    @LoadBalanced //注解表明开启负载均衡功能
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
