package com.lea.pattern_20_status;

import com.lea.pattern_20_status.common.ConcreteState1;
import com.lea.pattern_20_status.common.Context;

/**
 * @author lzc
 * @create 2020-12-3 14:35
 * 状态模式：
 *      当一个对象内在状态改变时，允许其改变行为，这个对象看起来像改变了其类
 * 状态模式的核心是封装，转态变更引起了行为的变更，从外部来看，就好像是这个对象对应的类发生了变化
 *
 * 看看三个角色
 * State 抽象状态角色
 *      接口或抽象类，负责对象转态定义，并且封装环境角色以实现状态切换
 * ConcreteState 具体状态角色
 *      每个具体状态必须完成两个职责，本状态的行为管理以及趋向状态管理，通俗讲，就是本状态下要做的事，以及本
 *      状态如何过渡到另一个状态
 * Context      环境角色
 *      定义客户端需要的接口，并且负责具体转态的切换
 *      环境角色有两个不成文的约定，
 *      1.把状态对象声明为静态常量，有几个状态对象就声明几个静态常量
 *      2.环境角色具有状态抽象角色定义的所有行为，具体执行使用委托方式，
 *
 * 使用场景
 *      1.行为随状态而改变的场景
 *      2.条件、分支判断语句的替代
 *
 * 注意事项：
 *  适用于当某个对象它的状态发生变化时，它的行为也随着变化，也就是说行为受状态约束的情况下，可以使用状态模式
 *  而且当使用对象的状态最好不要超过5个
 *
 */
public class StatusMain {

    public static void main(String[] args) {
        // 定义环境角色
        Context context = new Context();
        // 设置初始状态
        context.setState(new ConcreteState1());
        // 执行行为
        context.handle1();
        context.handle2();
    }
}
