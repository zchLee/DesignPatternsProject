package com.lea.pattern_20_status.test;

/**
 * @author lzc
 * @create 2020-12-3 14:47
 */
public class StopState extends LiftState {
    @Override
    public void open() {
        super.context.setLiftState(Context.openingState);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {
        // 不做操作
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.runningState);
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止了");
    }
}
