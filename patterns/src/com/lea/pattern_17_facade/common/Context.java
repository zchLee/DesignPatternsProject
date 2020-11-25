package com.lea.pattern_17_facade.common;

/**
 * @author lzc
 * @create 2020-11-25 11:03
 */
public class Context {
    // 委托处理
    private ClassA a = new ClassA();
    private ClassB b = new ClassB();

    // 复杂运算
    public void complexMethod() {
        a.doSomethingA();
        b.doSomethingB();
    }
}
