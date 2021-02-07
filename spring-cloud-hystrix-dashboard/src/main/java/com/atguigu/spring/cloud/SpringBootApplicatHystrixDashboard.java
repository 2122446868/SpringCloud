package com.atguigu.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * SpringBootApplicatHystrixDashboard
 * <功能详细描述>
 *
 * @author 赵长春
 * @version [版本号, 2021/2/4 10:16]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@EnableHystrixDashboard
@SpringBootApplication
public class SpringBootApplicatHystrixDashboard {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicatHystrixDashboard.class);
    }
}
