package com.lea.pattern_22_flyweight.common;

/**
 * @author lzc
 * @create 2020-12-5 15:47
 */
public class ConcreteFlyweight extends Flyweight {
    // 接受外部状态
    public ConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    // 操作
    @Override
    public void operate() {

    }
}
