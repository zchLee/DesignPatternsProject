package com.lea.pattern_9_command.common;

/**
 * @author lzc
 * @create 2020-11-17 10:25
 */
public class ConcreteCommand2 extends Command {
    private Receive receive;

    public ConcreteCommand2(Receive receive) {
        this.receive = receive;
    }

    @Override
    public void execute() {
        receive.doSomeThing();
        receive.doOtherThing();
    }
}
