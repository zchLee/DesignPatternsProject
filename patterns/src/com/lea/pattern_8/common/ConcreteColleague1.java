package com.lea.pattern_8.common;

/**
 * @author lzc
 * @create 2020-11-16 11:28
 * 具体同事类1
 */
public class ConcreteColleague1 extends Colleague {
    // 注入中介者
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }


    // 处理自己的业务方法逻辑
    public void selfMethod1() {

    }

    // 依赖中介者介入，调用其他的类业务逻辑
    public void depMethod1() {
        super.mediator.doSomething();
    }

}
