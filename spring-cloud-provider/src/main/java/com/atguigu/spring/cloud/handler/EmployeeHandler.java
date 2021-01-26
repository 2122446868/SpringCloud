package com.atguigu.spring.cloud.handler;

import com.atguigu.spring.cloud.entity.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

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

//    @RequestMapping("/provider/get/employee/remote")
//    public Employee getEmployeeRemote(HttpServletRequest request) {
////        获取当前服务的端口号
//        int port = request.getServerPort();
//        return new Employee(555, "tom555" + port, 555.555);
//    }
}
