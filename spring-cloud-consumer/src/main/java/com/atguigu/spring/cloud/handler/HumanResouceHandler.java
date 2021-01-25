package com.atguigu.spring.cloud.handler;

import com.atguigu.spring.cloud.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * HumanResouceHandler
 * <功能详细描述>
 *
 * @author 赵长春
 * @version [版本号, 2021/1/25 15:25]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@RestController
public class HumanResouceHandler {


    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/get/emoloyee/remote")
    public Employee getEmployee(){
//        1、远程调用方法的主机地址
        String host ="http://localhost:1000";
//        2、远程调用方法的具体URL地址
        String url="/provider/get/employee/remote";
//        3、通过RestTemplate调用远程微服务
        return restTemplate.getForObject(host+url,Employee.class);
    }
}
