package com.atguigu.spring.cloud.handler;

import com.atguigu.spring.cloud.entity.Employee;
import com.atguigu.spring.cloud.api.EmployeeRemoteService;
import com.atguigu.spring.cloud.util.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.Result;
import java.util.List;

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
    public ResultEntity<Employee> getEmployeeRemote(String signal){
       return employeeRemoteService.getEmployeeRemote(signal);

    }

    @RequestMapping("/provide/get/emp/list/remote")
    public List<Employee> getEmployeeListRemote( String keyword){

        return employeeRemoteService.getEmployeeListRemote(keyword);
    }
}
