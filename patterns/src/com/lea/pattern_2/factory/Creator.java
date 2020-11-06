package com.lea.pattern_2.factory;

/**
 * @author lzc
 * @create 2020-11-6 10:50
 *
 * 抽象工厂类
 */
public abstract class Creator {

    // 定义创建产品方法
    public abstract <T extends  Product> T createProduct(Class<T> c);

}
