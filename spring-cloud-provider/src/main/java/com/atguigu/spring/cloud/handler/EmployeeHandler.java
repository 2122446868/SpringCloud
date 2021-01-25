package com.atguigu.spring.cloud.handler;

import com.atguigu.spring.cloud.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * EmployeeHandler
 * <功能详细描述>
 *
 * @author 赵长春
 * @version [版本号, 2021/1/25 15:13]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@RestController
public class EmployeeHandler {

    @RequestMapping("/provider/get/employee/remote")
    public Employee getEmployeeRemote() {
        return new Employee(555, "tom555", 555.555);
    }
}
