package com.lea.pattern_8_mediator.common;

/**
 * @author lzc
 * @create 2020-11-16 11:27
 * 通用中介者抽象类
 */
public abstract class Mediator {

    // 定义同事类
    protected ConcreteColleague1 c1;
    protected ConcreteColleague2 c2;

    // 注入具体同事类
    public ConcreteColleague1 getC1() {
        return c1;
    }

    public void setC1(ConcreteColleague1 c1) {
        this.c1 = c1;
    }

    public ConcreteColleague2 getC2() {
        return c2;
    }

    public void setC2(ConcreteColleague2 c2) {
        this.c2 = c2;
    }

    // 中介模式的业务逻辑
    public abstract void doSomething();
    public abstract void doOtherThing();
}
