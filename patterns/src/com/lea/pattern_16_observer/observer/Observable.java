package com.lea.pattern_16_observer.observer;

import java.util.ArrayList;

/**
 * @author lzc
 * @create 2020-11-24 10:38
 * 被观察者抽象类
 */
public interface Observable {
    // 监视者集合
    ArrayList<Observer> observerList = new ArrayList<>();

    // 增加监视者
    void addObservable(Observer observer);
    // 删除监视者
    void deleteObservable(Observer observer);
    // 通知监视着
    void notifyObservers(String context);

}
