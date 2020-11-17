package com.lea.pattern_9.common;

/**
 * @author lzc
 * @create 2020-11-17 10:22
 * 具体接收者角色
 */
public class ConcreteReceive2 extends Receive {
    @Override
    public void doSomeThing() {
        System.out.println("ConcreteReceive2 doSomeThing");
    }

    @Override
    public void doOtherThing() {
        System.out.println("ConcreteReceive2 doOtherThing");
    }
}
