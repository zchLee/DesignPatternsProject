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
