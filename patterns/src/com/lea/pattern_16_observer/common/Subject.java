package com.lea.pattern_16_observer.common;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lzc
 * @create 2020-11-24 11:25
 * 被观察者抽象类，管理监察者，通知监察者
 */
public abstract class Subject {
    // 监察者集合
    public List<Observer> observerList = new ArrayList<>();
    // 添加观察者
    public abstract void addObserver(Observer observer);
    // 删除观察者
    public abstract void deleteObserver(Observer observer);
    // 通知观察者
    public abstract void notifyObserver(String context);

}
