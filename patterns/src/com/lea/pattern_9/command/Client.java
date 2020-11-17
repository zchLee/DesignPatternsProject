package com.lea.pattern_9.command;

/**
 * @author lzc
 * @create 2020-11-17 09:57
 */
public class Client {

    public static void main(String[] args) {
//        客户给需求组增加一个需求,客户每找一个组布置任务，就要new一个组对象
//        RequirementGroup requirementGroup = new RequirementGroup();
//        requirementGroup.find();
//        requirementGroup.add();

        // 改造后，只需要传入不同的命令就可以执行对应的事件
//        AddRequirementCommand command = new AddRequirementCommand();
        DeletePageCommand command = new DeletePageCommand();
        Invoker invoker = new Invoker(command);
        invoker.execute();
    }
}
