package com.lea.pattern_16_observer.common;

import javax.jws.Oneway;

/**
 * @author lzc
 * @create 2020-11-24 11:28
 * 具体被观察者，除了管理监察者，通知监察者外，还有自己的方法
 */
public class ConcreteSubject extends Subject {

    // 完成自己的方法时，通知监视者更新
    public void doSomeThing(String context) {
        System.out.println(context);
        this.notifyObserver(context);
    }

    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObserver(String context) {
        for (Observer observer : this.observerList) {
            observer.update(context);
        }
    }
}
