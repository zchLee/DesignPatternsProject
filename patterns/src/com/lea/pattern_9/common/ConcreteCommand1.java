package com.lea.pattern_9.common;

/**
 * @author lzc
 * @create 2020-11-17 10:25
 */
public class ConcreteCommand1 extends Command {
    private Receive receive;

    public ConcreteCommand1(Receive receive) {
        this.receive = receive;
    }

    @Override
    public void execute() {
        receive.doSomeThing();
        receive.doOtherThing();
    }
}
