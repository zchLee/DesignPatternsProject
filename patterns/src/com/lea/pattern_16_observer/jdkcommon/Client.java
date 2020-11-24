package com.lea.pattern_16_observer.jdkcommon;


/**
 * @author lzc
 * @create 2020-11-24 13:47
 * 在java中有内置的 观察者和被观察者
 * java.util.Observable         被观察者
 * java.util.Observer           观察者
 */
public class Client {

    public static void main(String[] args) {
        // 观察者
        ConcreteObserver observer = new ConcreteObserver();
        // 被观察者
        ConcreteObservable observable = new ConcreteObservable();
        // 添加观察者
        observable.addObserver(observer);

        observable.doSomething("被观察者在吃饭");
    }
}
