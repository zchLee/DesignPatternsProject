package com.lea.pattern_13_adapter.common;

/**
 * @author lzc
 * @create 2020-11-20 11:40
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("具体目标对象的方法");
    }
}
