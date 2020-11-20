package com.lea.pattern_13_adapter.common;

/**
 * @author lzc
 * @create 2020-11-20 11:42
 * 适配器模式
 */
public class Adapter extends Source implements Target {
    @Override
    public void request() {
        // 目标对象来调用 request(), 底层调用的还是源对象的 doSomething()
        super.doSomething();
    }
}
