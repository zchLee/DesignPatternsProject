package com.lea.pattern_20_status.test;

/**
 * @author lzc
 * @create 2020-12-3 14:47
 */
public class RunState extends LiftState {
    @Override
    public void open() {
        // 不做操作
    }

    @Override
    public void close() {
        // 不做操作
    }

    @Override
    public void run() {
        System.out.println("电梯运行");
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.stopState);
        super.context.getLiftState().stop();
    }
}
