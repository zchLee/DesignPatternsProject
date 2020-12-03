package com.lea.pattern_20_status.common;

/**
 * @author lzc
 * @create 2020-12-3 15:54
 */
public class ConcreteState2 extends State {
    @Override
    public void handle1() {
        // 本行为不处理， 过渡到其他状态处理
        super.context.setState(Context.STATE_1);
        super.context.getState().handle1();
    }

    @Override
    public void handle2() {
        // 本状态下具体要处理的逻辑
        System.out.println("handle2----------");
    }
}
