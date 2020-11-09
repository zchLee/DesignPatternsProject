package com.lea.pattern_3.abstractfactory;

/**
 * @author lzc
 * @create 2020-11-9 10:48
 *  产品B的抽象类
 */
public abstract class AbstractProductB {

    public void shareMethod() {
        System.out.println("产品B的公共方法");
    }

    // 产品B的不同实现
    public abstract void doSomethingMethod();
}
