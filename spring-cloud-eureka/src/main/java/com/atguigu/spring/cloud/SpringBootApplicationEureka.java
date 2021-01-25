package com.atguigu.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * SpringBootApplicationEureka
 * <功能详细描述>
 *
 * @author 赵长春
 * @version [版本号, 2021/1/25 16:32]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
//启用 Eureka 服务器功能
@EnableEurekaServer
@SpringBootApplication
public class SpringBootApplicationEureka {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationEureka.class,args);
    }
}
