package com.lea.pattern_19_visitor.common;

/**
 * @author lzc
 * @create 2020-12-2 10:36
 * 具体元素
 */
public class ConcreteElement2 extends Element {
    @Override
    public void doSomething() {
        System.out.println("元素2执行。。。");
    }

    // 允许谁访问
    @Override
    public void accept(IVisitor visitor) {
        visitor.visitor(this);
    }
}
