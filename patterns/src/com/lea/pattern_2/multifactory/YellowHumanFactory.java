package com.lea.pattern_2.multifactory;

/**
 * @author lzc
 * @create 2020-11-6 15:12
 *  黄种人生产工厂类
 */
public class YellowHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
