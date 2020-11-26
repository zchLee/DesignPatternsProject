package com.lea.pattern_18_memento.change;

/**
 * @author lzc
 * @create 2020-11-26 10:07
 * 根据单一职责，创建此类。用来保留和恢复原始状态
 * 备忘录类
 */
public class Memento {

    private String state;

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
