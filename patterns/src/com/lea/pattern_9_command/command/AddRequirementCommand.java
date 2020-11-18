package com.lea.pattern_9_command.command;

/**
 * @author lzc
 * @create 2020-11-17 10:02
 * 增加需求子类，具体的执行命令
 */
public class AddRequirementCommand extends Command {
    @Override
    public void execute() {
        // 找到需求组
        super.rg.find();
        // 增加需求
        super.rg.add();
        // 给出计划
        super.rg.plan();
    }
}
