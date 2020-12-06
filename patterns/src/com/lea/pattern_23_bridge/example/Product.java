package com.lea.pattern_23_bridge.example;

/**
 * @author lzc
 * @create 2020-12-6 17:06
 */
public abstract class Product {
    // 甭管什么产品，都要被生产出来 产品生产方法
    public abstract void beProduced();

    // 销售产品
    public abstract void beSell();
}
