package com.lea.pattern_16_observer.observer;

/**
 * @author lzc
 * @create 2020-11-24 11:04
 * 另一个监视者
 */
public class WangSi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("王斯 看到 韩非子在行动，");
        this.write(context);
    }

    public void write(String context) {
        System.out.println("记录韩非子的活动:" + context);
    }
}
