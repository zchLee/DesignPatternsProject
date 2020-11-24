package com.lea.pattern_16_observer.observer;

/**
 * @author lzc
 * @create 2020-11-24 11:06
 */
public class ZhangSi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("张斯看到韩非子在行动，");
        copy(context);
    }


    public void copy(String context) {
        System.out.println("张斯模仿韩非子的行动：" + context);
    }
}
