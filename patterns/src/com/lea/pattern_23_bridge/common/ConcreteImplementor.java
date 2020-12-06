package com.lea.pattern_23_bridge.common;

/**
 * @author lzc
 * @create 2020-12-6 22:07
 */
public class ConcreteImplementor implements Implementor {
    @Override
    public void doSomething() {
        System.out.println("具体实现 doSomething");
    }

    @Override
    public void doAnything() {
        System.out.println("具体实现 doAnything");
    }
}
