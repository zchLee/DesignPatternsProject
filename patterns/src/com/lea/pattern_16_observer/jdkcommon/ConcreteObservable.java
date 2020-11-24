package com.lea.pattern_16_observer.jdkcommon;


import java.util.Observable;

/**
 * @author lzc
 * @create 2020-11-24 13:48
 * 具体被观察者
 */
public class ConcreteObservable extends Observable {

    public void doSomething(String context) {
        System.out.println("被观察者：" + context);
        // 开启通知
        this.setChanged();
        this.notifyObservers(context);
    }

}
