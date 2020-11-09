package com.lea.pattern_3.abstractfactory;

/**
 * @author lzc
 * @create 2020-11-9 10:59
 *
 *  只产生一组 等级为1 的产品
 */
public class Creator_2 extends AbstractCreator {
    // 只产生等级为2的产品A
    @Override
    public AbstractProductA creatorProductA() {
        return new ProductA_2();
    }

    // 只产生等级为2的产品B
    @Override
    public AbstractProductB creatorProductB() {
        return new ProductB_2();
    }
}
