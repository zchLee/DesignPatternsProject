package com.lea.pattern_16_observer.observer;

/**
 * @author lzc
 * @create 2020-11-24 11:02
 */
public class LiSi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("李斯监视到 韩非子 有行动，自己也行动起来");
        this.report(context);
        System.out.println("汇报完毕");
    }

    public void report(String context) {
        System.out.println("向秦始皇报告：" + context);

    }
}
