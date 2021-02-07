package com.atguigu.spring.cloud.handler;

import com.atguigu.spring.cloud.entity.Employee;
import com.atguigu.spring.cloud.util.ResultEntity;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

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
    private Logger log = LoggerFactory.getLogger(EmployeeHandler.class);





    @HystrixCommand(fallbackMethod = "getEmployeeRemoteBackUp")
    @RequestMapping("/provider/get/employee/remote")
    public ResultEntity<Employee> getEmployeeRemote(@RequestParam("signal") String signal) throws InterruptedException {
        if ("bang".equals(signal)) {
            throw new RuntimeException();
        }
        if ("stop".equals(signal)) {
            Thread.sleep(6000);

        }
        return ResultEntity.successWithData(new Employee(555, "tom555", 555.555));
    }

    public ResultEntity<Employee> getEmployeeRemoteBackUp(@RequestParam("signal") String signal) {
        String message = "失败返回 signal=" + signal;
        return ResultEntity.failed(message);
    }


    @RequestMapping("/provide/get/emp/list/remote")
    public List<Employee> getEmployeeListRemote(@RequestParam("keyword") String keyword) {

        log.info("keyword=" + keyword);

        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(11, "tom11", 11.555));
        list.add(new Employee(22, "tom22", 22.555));
        list.add(new Employee(33, "tom33", 33.555));
        list.add(new Employee(44, "tom44", 44.555));

        return list;
    }


//    @RequestMapping("/provider/get/employee/remote")
//    public Employee getEmployeeRemote(HttpServletRequest request) {
////        获取当前服务的端口号
//        int port = request.getServerPort();
//        return new Employee(555, "tom555" + port, 555.555);
//    }


    public String getTest() {

        return null;
    }
}
