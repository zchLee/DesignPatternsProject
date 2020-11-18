package com.lea.pattern_8_mediator.common;

/**
 * @author lzc
 * @create 2020-11-16 11:28
 * 具体同事类2
 */
public class ConcreteColleague2 extends Colleague  {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    // 处理自己的业务方法逻辑
    public void selfMethod2() {

    }

    // 依赖中介者介入，调用其他的类业务逻辑
    public void depMethod2() {
        super.mediator.doSomething();
    }
}
