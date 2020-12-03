package com.lea.pattern_20_status.test;

/**
 * @author lzc
 * @create 2020-12-3 14:46
 */
public class CloseState extends LiftState {
    @Override
    public void open() {
        super.context.setLiftState(Context.openingState);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭");
    }

    @Override
    public void run() {
        // 改变状态
        super.context.setLiftState(Context.runningState);
        // 将动作委托为RunState来执行
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.stopState);
        super.context.getLiftState().stop();
    }
}
