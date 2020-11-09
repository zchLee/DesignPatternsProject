package com.lea.pattern_3.abstractfactory;

/**
 * @author lzc
 * @create 2020-11-9 10:41
 *  抽象产品A
 */
public abstract class AbstractProductA {

    // 产品A的共有方法
    public void shareMethod() {
        System.out.println("产品A的公有方法");
    }


    // 不同A产品类的 不同实现
    public abstract void doSomething();

}
