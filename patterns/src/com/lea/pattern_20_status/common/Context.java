package com.lea.pattern_20_status.common;

/**
 * @author lzc
 * @create 2020-12-3 15:51
 * 具体环境角色
 */
public class Context {
    // 状态
    public final static ConcreteState1 STATE_1 = new ConcreteState1();
    public final static ConcreteState2 STATE_2 = new ConcreteState2();

    private State state;
//  设置行为状态
    public State getState() {
        return state;
    }

    // 设置当前状态
    public void setState(State state) {
        this.state = state;
        // 切换状态
        this.state.setContext(this);
    }

    // 行为委托
    public void handle1() {
        this.state.handle1();
    }

    public void handle2() {
        this.state.handle2();
    }
}
