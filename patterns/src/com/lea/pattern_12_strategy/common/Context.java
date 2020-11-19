package com.lea.pattern_12_strategy.common;

/**
 * @author lzc
 * @create 2020-11-19 11:44
 */
public class Context {

    private Strategy strategy;

    // 构造设置具体策略
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    // 封装后的策略方法
    public void contextInterface() {
        this.strategy.algorithmInterface();
    }
}
