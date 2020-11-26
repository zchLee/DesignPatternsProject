package com.lea.pattern_18_memento.change;

/**
 * @author lzc
 * @create 2020-11-26 10:05
 */
public class Boy {

    private String state = "";

    public void changeState() {
        this.state = "心情不好哦";
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(this.getState());
    }

    public void restoreMemento(Memento memento) {
        this.setState(memento.getState());
    }
}
