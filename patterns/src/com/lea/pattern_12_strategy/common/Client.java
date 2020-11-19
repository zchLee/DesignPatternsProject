package com.lea.pattern_12_strategy.common;

/**
 * @author lzc
 * @create 2020-11-19 11:46
 */
public class Client {

    public static void main(String[] args) {
        ConcreteStrategyC strategyC = new ConcreteStrategyC();
        Context context = new Context(strategyC);
        context.contextInterface();
    }
}
