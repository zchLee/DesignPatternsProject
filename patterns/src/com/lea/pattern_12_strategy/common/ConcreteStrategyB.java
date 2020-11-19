package com.lea.pattern_12_strategy.common;

/**
 * @author lzc
 * @create 2020-11-19 11:43
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("algorithm method B....");
    }
}
