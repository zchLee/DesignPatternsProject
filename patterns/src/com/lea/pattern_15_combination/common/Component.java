package com.lea.pattern_15_combination.common;

/**
 * @author lzc
 * @create 2020-11-23 15:40
 */
public abstract class Component {
    // 个体和整体都具有共享
    public void doSomething() {
        // 具体业务逻辑
        System.out.println(this + "开始干事了");
    }
}
