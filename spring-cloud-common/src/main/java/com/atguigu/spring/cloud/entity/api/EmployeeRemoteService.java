package com.atguigu.spring.cloud.entity.api;

import com.atguigu.spring.cloud.entity.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "atguigu-provider")
public interface EmployeeRemoteService {

    @RequestMapping("/provider/get/employee/remote")
    public Employee getEmployeeRemote();
}