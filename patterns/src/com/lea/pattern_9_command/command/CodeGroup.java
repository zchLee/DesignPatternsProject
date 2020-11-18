package com.lea.pattern_9_command.command;

/**
 * @author lzc
 * @create 2020-11-17 09:48
 */
public class CodeGroup extends Group {
    @Override
    public void find() {
        System.out.println("找到代码祖");
    }

    @Override
    public void add() {
        System.out.println("增加一个功能");
    }

    @Override
    public void delete() {
        System.out.println("删除一个功能");
    }

    @Override
    public void change() {
        System.out.println("改变一个功能");
    }

    @Override
    public void plan() {
        System.out.println("客户要求代码变更计划");
    }
}
