package com.lea.pattern_9_command.command;

/**
 * @author lzc
 * @create 2020-11-17 09:50
 * 美工组
 */
public class PageGroup extends Group {
    @Override
    public void find() {
        System.out.println("找到美工组");
    }

    @Override
    public void add() {
        System.out.println("增加一个页面");
    }

    @Override
    public void delete() {
        System.out.println("删除一个页面");
    }

    @Override
    public void change() {
        System.out.println("改变一个页面");
    }

    @Override
    public void plan() {
        System.out.println("客户要求美工变更计划");
    }
}
