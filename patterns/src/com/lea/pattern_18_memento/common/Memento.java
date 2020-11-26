package com.lea.pattern_18_memento.common;

/**
 * @author lzc
 * @create 2020-11-26 10:42
 */
public class Memento {
    private String state;

    // 构造函数传参
    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
