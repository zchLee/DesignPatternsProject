package com.lea.pattern_18_memento.clonememento;

/**
 * @author lzc
 * @create 2020-11-26 10:43
 */
public class Caretaker {
    private Originator originator;

    public Originator getOriginator() {
        return originator;
    }

    public void setOriginator(Originator originator) {
        this.originator = originator;
    }
}
