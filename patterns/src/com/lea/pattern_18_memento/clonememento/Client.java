package com.lea.pattern_18_memento.clonememento;

/**
 * @author lzc
 * @create 2020-11-26 11:31
 */
public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("init");
        System.out.println("初始化状态:" + originator.getState());

        //  建立备份
        originator.createMemento();

        originator.setState("run");
        System.out.println("改变后的状态:" + originator.getState());

        originator.restoreMemento();
        System.out.println("恢复后的状态:" + originator.getState());
    }
}
