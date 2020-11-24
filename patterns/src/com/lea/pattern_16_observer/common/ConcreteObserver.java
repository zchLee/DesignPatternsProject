package com.lea.pattern_16_observer.common;

/**
 * @author lzc
 * @create 2020-11-24 11:31
 * 具体监视者
 */
public class ConcreteObserver implements Observer {
    @Override
    public void update(String context) {
        System.out.println("监视者1：" + context);
    }
}
