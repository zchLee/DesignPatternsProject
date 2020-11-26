package com.lea.pattern_18_memento.common;

/**
 * @author lzc
 * @create 2020-11-26 10:41
 */
public class Originator {
    // 内部状态
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(this.state);
    }

    // 返回保存点
    public void restoreMemento(Memento memento) {
        this.setState(memento.getState());
    }
}
