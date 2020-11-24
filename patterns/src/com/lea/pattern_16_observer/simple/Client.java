package com.lea.pattern_16_observer.simple;

/**
 * @author lzc
 * @create 2020-11-24 10:31
 * 李斯监视韩非子设计
 *
 * 单个的观察者模式起作用了，但是多个的观察者呢，在方法中定义多个观察者么？被观察者更多的行文呢，在每个行为中添加监视么？
 * 这不符合开闭原则鸭
 */
public class Client {

    public static void main(String[] args) {
        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.haveBreakfast();
    }
}
