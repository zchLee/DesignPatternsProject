package com.lea.pattern_2_factory.multifactory;

/**
 * @author lzc
 * @create 2020-11-6 15:37
 * 多工厂模式避免调用者与子工厂直接接触，这里作为协调者，封装子工厂类
 */
public class HumanFactory {

    public static Human createYellowHuman() {
        return new YellowHumanFactory().createHuman();
    }

    public static Human createWhiteHuman() {
        return new WhiteHumanFactory().createHuman();
    }

    public static Human createBlackHuman() {
        return new BlackHumanFactory().createHuman();
    }

}
