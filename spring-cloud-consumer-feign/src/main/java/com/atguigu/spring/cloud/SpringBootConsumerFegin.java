package com.atguigu.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * SpringBootConsumerFegin
 * <功能详细描述>
 *
 * @author 赵长春
 * @version [版本号, 2021/1/26 17:50]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
// 启用Fegin客户端功能
@EnableFeignClients
@SpringBootApplication
public class SpringBootConsumerFegin {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootConsumerFegin.class, args);
    }
}
