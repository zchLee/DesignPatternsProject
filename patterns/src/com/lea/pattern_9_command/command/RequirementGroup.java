package com.lea.pattern_9_command.command;

/**
 * @author lzc
 * @create 2020-11-17 09:52
 * 需求组
 */
public class RequirementGroup extends Group {
    @Override
    public void find() {
        System.out.println("找到需求组");
    }

    @Override
    public void add() {
        System.out.println("增加一个需求");
    }

    @Override
    public void delete() {
        System.out.println("减少一个需求");
    }

    @Override
    public void change() {
        System.out.println("修改一个需求");
    }

    @Override
    public void plan() {
        System.out.println("客户需要需求组变更计划");
    }
}
