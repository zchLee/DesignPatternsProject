package com.lea.pattern_16_observer.jdkcommon;

import java.util.Observable;
import java.util.Observer;

/**
 * @author lzc
 * @create 2020-11-24 13:50
 * 具体观察者
 */
public class ConcreteObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("观察者：" + arg);
    }
}
