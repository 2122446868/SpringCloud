package com.atguigu.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

/**
 * SpringBootApplication
 * <功能详细描述>
 *
 * @author 赵长春
 * @version [版本号, 2021/1/25 15:11]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
// 启用断路器功能
@EnableCircuitBreaker
@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplicationProvider {
    public static void main(String[] args) {

        SpringApplication.run(SpringBootApplicationProvider.class,args);
    }
}
