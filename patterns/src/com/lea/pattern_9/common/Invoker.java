package com.lea.pattern_9.common;

/**
 * @author lzc
 * @create 2020-11-17 10:27
 * 调用者，什么命令都直接接受，
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void execute() {
        this.command.execute();
    }
}
