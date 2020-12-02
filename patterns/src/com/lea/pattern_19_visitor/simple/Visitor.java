package com.lea.pattern_19_visitor.simple;

/**
 * @author lzc
 * @create 2020-12-2 10:03
 */
public class Visitor implements IVisitor {
    @Override
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(this.getCommonEmployeeInfo(commonEmployee));
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(this.getManagerInfo(manager));
    }

    // 组装出基本信息
    private String getBasicInfo(Employee employee) {
        String info = "姓名：" + employee.getName() + "\t";
        info += "性别：" + (employee.getSex() == Employee.MALE ? '男' : '女') + "\t";
        info += "薪水：" + employee.getSalary() + "\t";
        return info;
    }
    // 组装出部门经理信息
    private String getManagerInfo(Employee employee) {
        String basicInfo = this.getBasicInfo(employee);
        return basicInfo + "业绩：" + employee.getOtherInfo() + "\t";
    }
    // 组装出普通员工信息
    private String getCommonEmployeeInfo(Employee employee) {
        String basicInfo = this.getBasicInfo(employee);
        return basicInfo + "工作：" + employee.getOtherInfo() + "\t";
    }
}
