package com.lea.pattern_8.mediator;

/**
 * @author lzc
 * @create 2020-11-16 10:51
 * 增加同事抽象类，三个具体类分别继承该抽象类
 */
public abstract class AbstractColleague {

    protected AbstractMediator mediator;
    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
