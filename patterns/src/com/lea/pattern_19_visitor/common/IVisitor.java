package com.lea.pattern_19_visitor.common;

/**
 * @author lzc
 * @create 2020-12-2 10:35
 * 抽象访问者
 */
public interface IVisitor {
    // 定义可以访问的角色
    void visitor(ConcreteElement1 e1);
    void visitor(ConcreteElement2 e2);

}
