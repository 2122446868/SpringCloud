package com.atguigu.spring.cloud.api;

import com.atguigu.spring.cloud.entity.Employee;
import com.atguigu.spring.cloud.util.ResultEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.transform.Result;
import java.util.List;

@FeignClient(value = "atguigu-provider",fallbackFactory = MyFallbackFactory.class)
public interface EmployeeRemoteService {

    @RequestMapping("/provider/get/employee/remote")
    public ResultEntity<Employee> getEmployeeRemote(@RequestParam("signal") String signal);


    @RequestMapping("/provide/get/emp/list/remote")
    public List<Employee>  getEmployeeListRemote(@RequestParam("keyword") String keyword);


//    @RequestMapping("/provider/get/employee/remote")
//    public ResultEntity<Employee> getEmpWithCircuirBreake(@RequestParam("signal") String signal);
}