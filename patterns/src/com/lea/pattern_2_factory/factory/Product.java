package com.lea.pattern_2_factory.factory;

/**
 * @author lzc
 * @create 2020-11-6 10:47
 * 抽象一个 产品
 */
public abstract class Product {

    // 产品共有的抽象方法
    public abstract void method();

    // 产品共有的方法
    public void commonMethod() {
        System.out.println("产品共有方法");
    }
}
