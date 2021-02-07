package com.atguigu.spring.cloud.api;

import com.atguigu.spring.cloud.entity.Employee;
import com.atguigu.spring.cloud.util.ResultEntity;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * FallbackFactory
 * <功能详细描述>
 *
 * @author 赵长春
 * @version [版本号, 2021/2/4 9:12]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Component
public class MyFallbackFactory implements feign.hystrix.FallbackFactory<EmployeeRemoteService> {

    public EmployeeRemoteService create(final Throwable cause) {
        return new EmployeeRemoteService() {
            public ResultEntity<Employee> getEmployeeRemote(String signal) {
                return ResultEntity.failed("降级生效" + cause.getMessage());
            }

            public List<Employee> getEmployeeListRemote(String keyword) {
                return null;
            }


        };
    }
}



