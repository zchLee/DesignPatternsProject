package com.lea.pattern_2_factory.multifactory;

/**
 * @author lzc
 * @create 2020-11-6 15:13
 * 白种人工厂类 火候不足 没烧熟就出来了
 */
public class WhiteHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}
