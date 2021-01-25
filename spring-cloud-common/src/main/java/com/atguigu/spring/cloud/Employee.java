package com.atguigu.spring.cloud;

/**
 * Employee
 * <功能详细描述>
 *
 * @author 赵长春
 * @version [版本号, 2021/1/25 14:53]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Employee {
    private Integer empId;
    private String empName;
    private Double empSalary;

    public Employee() {
    }

    public Employee(Integer empId, String empName, Double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Double empSalary) {
        this.empSalary = empSalary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }
}
