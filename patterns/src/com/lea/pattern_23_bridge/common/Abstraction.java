package com.lea.pattern_23_bridge.common;

/**
 * @author lzc
 * @create 2020-12-6 21:50
 * 抽象化角色
 */
public abstract class Abstraction {

    private Implementor impl;
    // 约束子类必须实现该构造函数
    public Abstraction(Implementor impl) {
        this.impl = impl;
    }

    // 自身行为和属性
    public void request() {
        this.impl.doSomething();
        this.impl.doAnything();
    }
    // 获得实现化角色
    public Implementor getImpl() {
        return impl;
    }
}
