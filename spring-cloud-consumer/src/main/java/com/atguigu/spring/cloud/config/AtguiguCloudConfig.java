package com.atguigu.spring.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * AtguiguCloudConfig
 * <功能详细描述>
 *
 * @author 赵长春
 * @version [版本号, 2021/1/25 15:24]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Configuration
public class AtguiguCloudConfig {


    @LoadBalanced // 支持负载均衡
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
