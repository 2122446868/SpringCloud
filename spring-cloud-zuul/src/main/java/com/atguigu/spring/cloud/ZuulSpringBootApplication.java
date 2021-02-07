package com.atguigu.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * ZuulSpringBootApplication
 * <功能详细描述>
 *
 * @author 赵长春
 * @version [版本号, 2021/2/7 18:36]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
//启动Zuul代理功能
@EnableZuulProxy
@SpringBootApplication
public class ZuulSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulSpringBootApplication.class,args);
    }
}
