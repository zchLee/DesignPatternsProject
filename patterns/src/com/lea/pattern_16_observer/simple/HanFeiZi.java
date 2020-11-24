package com.lea.pattern_16_observer.simple;

/**
 * @author lzc
 * @create 2020-11-24 10:30
 */
public class HanFeiZi implements IHanfeizi {
    private ILisi lisi = new Lisi();
    @Override
    public void haveBreakfast() {
        System.out.println("韩非子在吃饭");
        lisi.update("韩非子在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子开始娱乐了");
        lisi.update("韩非子开始娱乐了");
    }
}
