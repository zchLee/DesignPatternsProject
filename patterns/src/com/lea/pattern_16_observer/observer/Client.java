package com.lea.pattern_16_observer.observer;

/**
 * @author lzc
 * @create 2020-11-24 10:35
 * 在simple包的设计下，做如下修改
 * 增加Observable，实现该接口的都是被观察者
 * 修改ILiSi接口为Observer，所有实现该接口的都是观察者
 */
public class Client {

    public static void main(String[] args) {
        // 三个观察者声明出来
        Observer liSi = new LiSi();
        Observer wangSi = new WangSi();
        Observer zhangSi = new ZhangSi();
        // 定义韩非子
        HanFeiZi hanFeiZi = new HanFeiZi();
        // 添加观察者，有这三个人在监视韩非子
        hanFeiZi.addObservable(liSi);
        hanFeiZi.addObservable(wangSi);
        hanFeiZi.addObservable(zhangSi);
        // 韩非子自己的行动
        hanFeiZi.haveBreakfast();

    }
}
