package com.lea.pattern_3_abstractfacroty.abstractfactory;

/**
 * @author lzc
 * @create 2020-11-9 10:53
 *
 * 抽象工厂 产生 相关或相互依赖的对象
 *
 */
public abstract class AbstractCreator {

    // 创建产品A的产品家族
    public abstract AbstractProductA creatorProductA();
    // 创建产品B的产品家族
    public abstract AbstractProductB creatorProductB();
}
