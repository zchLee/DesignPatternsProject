package com.lea.pattern_16_observer.observer;

/**
 * @author lzc
 * @create 2020-11-24 10:38
 * 观察者抽象类
 */
public interface Observer {
    // 一发现别人有动静，自己就行动起来
    void update(String context);
}
