package com.lea.pattern_2_factory.lazyinit;

import com.lea.pattern_2_factory.factory.Product;

/**
 * @author lzc
 * @create 2020-11-6 10:52
 * 提供一个具体产品
 */
public class ConcreteProduct2 extends Product {
    @Override
    public void method() {
        System.out.println("---------------具体产品2展示-----------");
    }
}
