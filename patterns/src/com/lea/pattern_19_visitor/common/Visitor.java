package com.lea.pattern_19_visitor.common;

/**
 * @author lzc
 * @create 2020-12-2 10:39
 * 具体访问者
 */
public class Visitor implements IVisitor {
    @Override
    public void visitor(ConcreteElement1 e1) {
        e1.doSomething();
        System.out.println("做其他操作");
    }

    @Override
    public void visitor(ConcreteElement2 e2) {
        e2.doSomething();
        System.out.println("做其他操作 然后吃饭");
    }
}
