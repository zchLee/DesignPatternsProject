package com.lea.pattern_9_command.command;

/**
 * @author lzc
 * @create 2020-11-17 10:06
 * 负责人类
 */
public class Invoker {
    // 什么命令
    Command command;

    // 客户传入命令
    public Invoker(Command command) {
        this.command = command;
    }

    // 负责人执行，分工
    public void execute() {
        command.execute();
    }

}
