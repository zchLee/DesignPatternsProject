package com.lea.pattern_19_visitor.common;

/**
 * @author lzc
 * @create 2020-12-2 10:36
 * 具体元素
 */
public class ConcreteElement1 extends Element {
    @Override
    public void doSomething() {
        System.out.println("元素1执行。。。");
    }

    // 允许哪个访问者来访问
    @Override
    public void accept(IVisitor visitor) {
        visitor.visitor(this);
    }
}
