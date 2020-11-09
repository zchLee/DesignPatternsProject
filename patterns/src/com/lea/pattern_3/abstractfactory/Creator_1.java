package com.lea.pattern_3.abstractfactory;

/**
 * @author lzc
 * @create 2020-11-9 10:57
 *
 * 只产生一组 等级为1 的产品
 */
public class Creator_1 extends AbstractCreator {
    // 只产生产品A的等级为1的产品
    @Override
    public AbstractProductA creatorProductA() {
        return new ProductA_1();
    }
    // 只产生产品B的等级为1的产品
    @Override
    public AbstractProductB creatorProductB() {
        return new ProductB_2();
    }
}
