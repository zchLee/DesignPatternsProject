package com.lea.pattern_18_memento;

import com.lea.pattern_18_memento.common.Caretaker;
import com.lea.pattern_18_memento.common.Originator;

/**
 * @author lzc
 * @create 2020-11-26 09:52
 * 备忘录模式：
 *  在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可将对象恢复到原先保持的状态
 * 一般的备忘录有三个角色
 *  Originator 发起人角色
 *      记录当前时刻的内部状态，负责定义哪些属于备份范围的状态，负责创建和恢复备忘录的数据
 *  Memento  备忘录角色
 *      负责存储Originator发起人对象的内部状态，在需要时提供发起人需要的内部状态
 *  Caretaker 备忘录管理者角色
 *      对备忘录进行管理，保存和提供备忘录
 *
 *  应用：
 *      备忘录模式有太多的变形和处理方式，每种方式都有它自己的优点和缺点，标准的备忘录模式很难在项目中遇到，基本上都有
 *      一些变换方式。因此在使用备忘录模式时，主要了解如何应用以及需要注意哪些事项就成了
 *  使用场景：
 *      1.需要保存和恢复数据相关的状态场景
 *      2.提供一个可回滚的操作，比如Word中的 Ctrl+Z
 *      3.需要监控的副本场景中，
 *      4.数据库连接的事务管理就是用的备忘录模式。如果你要实现一个JDBC驱动，你怎么来实现事务？
 *  注意事项:
 *      1.备忘录的生命周期
 *          备忘录要创建出来就要在“最近”的代码中使用，要主动管理它的生命周期，建立就要使用，不适用就要立刻删除引用
 *          等待垃圾回收器对它的回收处理
 *       2.备忘录的性能
 *          不要在频繁建立备份的场景使用备忘录模式，比如一个for循环，原因有二
 *              一、是控制不了备忘录建立的对象数量
 *              二、大对象的建立是消耗资源的，系统的性能需要考虑
 *
 *  扩展使用：
 *      1.clone方式的备忘录
 *          只要发起人角色实现了Cloneable就成.利用原型模式，让发起人自主备份。不过原型模式设计到深拷贝和浅拷贝问题，
 *          会在复杂场景中让程序逻辑异常混乱
 *      2.多状态备忘录模式
 *          在备忘录角色中的 单个属性用 Map 来替换掉， 详情见 multimement包下
 *      注意:
 *          如果要设计一个在运行期间决定备份状态的框架，则建议采用AOP框架来实现，避免动态代理无谓地增加程序逻辑复杂性
 *      3.多备份备忘录模式
 *          在管理备份角色类中，将单个备份属性，修改成Map结构 key存 备份版本， value 存备份点
 *
 */
public class MementoMain {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("init");
        System.out.println("发起人:" + originator.getState());
        // 在备忘录管理者中管理备忘录
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());
        // 发起人改变状态了
        originator.setState("run");
        System.out.println("发起人改变状态:" + originator.getState());
        // 恢复发起人状态
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("发起人恢复状态:" + originator.getState());
    }
}
