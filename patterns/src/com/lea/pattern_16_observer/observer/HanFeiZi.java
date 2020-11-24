package com.lea.pattern_16_observer.observer;

import java.util.ArrayList;

/**
 * @author lzc
 * @create 2020-11-24 10:57
 */
public class HanFeiZi implements IHanFeiZi, Observable {
//    private ArrayList<Observer> observerList = new ArrayList<>();
    @Override
    public void haveBreakfast() {
        System.out.println("韩非子：开始吃饭了");
        this.notifyObservers("韩非子在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子：开始娱乐");
        this.notifyObservers("韩非子在娱乐");
    }

    // 增加通知者
    @Override
    public void addObservable(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void deleteObservable(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers(String context) {
        for (Observer observer : this.observerList) {
            observer.update(context);
        }
    }
}
