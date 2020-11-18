package com.lea.pattern_8_mediator.mediator;

/**
 * @author lzc
 * @create 2020-11-16 10:08
 * 抽奖中介者类
 */
public abstract class AbstractMediator {

    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    // 构造方法
    public AbstractMediator () {
        purchase = new Purchase(this);
        sale = new Sale(this);
        stock = new Stock(this);
    }

    // 中介最终要的方法叫做事件方法，处理多个对象之间的关系
    public abstract void execute(String str, Object... objects);
}
