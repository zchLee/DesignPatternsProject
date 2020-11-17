package com.lea.pattern_9.command;

import com.lea.pattern_3.abstractfactory.AbstractCreator;

/**
 * @author lzc
 * @create 2020-11-17 09:59
 * 抽象命令类
 */
public abstract class Command {
    // 将三个组封装进来,方便子类（具体的命令类）调用
    protected RequirementGroup rg = new RequirementGroup();
    protected CodeGroup cg = new CodeGroup();
    protected PageGroup pg = new PageGroup();

    // 具体执行命令，由子类来定义
    public abstract void execute();

}
