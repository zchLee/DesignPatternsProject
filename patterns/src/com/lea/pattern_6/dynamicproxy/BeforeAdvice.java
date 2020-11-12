package com.lea.pattern_6.dynamicproxy;

/**
 * @author lzc
 * @create 2020-11-12 14:01
 */
public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("前置通知");
    }
}
