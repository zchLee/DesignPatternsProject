package com.lea.pattern_18_memento.clonememento;

/**
 * @author lzc
 * @create 2020-11-26 10:41
 */
public class Originator implements Cloneable {
    private Originator backup;
    // 内部状态
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void createMemento() {
        this.backup = this.clone();
    }

    // 返回保存点
    public void restoreMemento() {
        this.setState(this.backup.getState());
    }

    @Override
    protected Originator clone() {
        try {
            return (Originator) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
