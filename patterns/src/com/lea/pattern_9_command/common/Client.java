package com.lea.pattern_9_command.common;

/**
 * @author lzc
 * @create 2020-11-17 10:28
 */
public class Client {

    public static void main(String[] args) {
        ConcreteReceive2 receive2 = new ConcreteReceive2();
        Command command = new ConcreteCommand2(receive2);
        Invoker invoker = new Invoker(command);
    }
}
