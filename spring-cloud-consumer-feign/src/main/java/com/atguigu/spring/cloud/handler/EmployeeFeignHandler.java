package com.atguigu.spring.cloud.handler;

import com.atguigu.spring.cloud.entity.Employee;
import com.atguigu.spring.cloud.entity.api.EmployeeRemoteService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * EmployeeFeignHandler
 * <功能详细描述>
 *
 * @author 赵长春
 * @version [版本号, 2021/1/26 17:52]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@RestController
public class EmployeeFeignHandler {

    @Autowired
    private EmployeeRemoteService employeeRemoteService;

    @RequestMapping("/feign/consumer/get/emp")
    public Employee getEmployeeRemote(){
        return employeeRemoteService.getEmployeeRemote();

    }
}
