package com.lea.pattern_19_visitor.simple;

/**
 * @author lzc
 * @create 2020-11-30 10:00
 */
public interface IVisitor {

    // 定义访问普通员工
    void visit (CommonEmployee commonEmployee);
    // 定义访问部门经理
    void visit (Manager manager);
}
