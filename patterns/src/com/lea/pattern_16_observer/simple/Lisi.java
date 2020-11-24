package com.lea.pattern_16_observer.simple;

/**
 * @author lzc
 * @create 2020-11-24 10:28
 */
public class Lisi implements ILisi {
    @Override
    public void update(String str) {
        System.out.println("李斯观察到韩非子活动，开始想老板会报");
        this.reportToQinShiHuang(str);
        System.out.println("李斯: 会报完毕");
    }

    public void reportToQinShiHuang(String content) {
        System.out.println("李斯报告:秦老板，韩非子有活动了---》" + content);
    }
}
