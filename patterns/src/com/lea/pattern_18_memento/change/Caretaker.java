package com.lea.pattern_18_memento.change;

/**
 * @author lzc
 * @create 2020-11-26 10:23
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
