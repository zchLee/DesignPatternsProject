package com.lea.pattern_2.multifactory;

/**
 * @author lzc
 * @create 2020-11-6 15:13
 * 火候太足了 烧黑了
 */
public class BlackHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
