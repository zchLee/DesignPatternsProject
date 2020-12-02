package com.lea.pattern_19_visitor.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lzc
 * @create 2020-11-27 09:59
 */
public class Client {

    public static void main(String[] args) {
        for (Employee employee : mockEmployee()) {
            employee.accept(new Visitor());
        }
    }

    public static List<Employee> mockEmployee() {
        ArrayList<Employee> list = new ArrayList<>();
        // 产生张三这个员工
        CommonEmployee zhangSan = new CommonEmployee();
        zhangSan.setJob("编写java程序，绝对的蓝领、苦工加搬运工");
        zhangSan.setName("张三");
        zhangSan.setSalary(1800);
        zhangSan.setSex(Employee.MALE);
        list.add(zhangSan);

        CommonEmployee ls = new CommonEmployee();
        ls.setJob("页面没工农");
        ls.setName("李四");
        ls.setSalary(1900);
        ls.setSex(Employee.FEMALE);
        list.add(ls);

        Manager manager = new Manager();
        manager.setPerformance("基本上就是负值，但我会拍马屁");
        manager.setName("小领导");
        manager.setSalary(18750);
        manager.setSex(Employee.MALE);
        list.add(manager);
        return list;
    }
}
