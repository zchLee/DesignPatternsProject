package com.lea.pattern_20_status.test;

/**
 * @author lzc
 * @create 2020-12-3 14:40
 */
public abstract class LiftState {
    // 定义一个环境角色，也就是状态的变化引起的变化
    protected Context context;
    public void setContext(Context context) {
        this.context = context;
    }

    // 首先电梯门开启动作
    public abstract void open();
    // 电梯门关闭动作
    public abstract void close();
    // 电梯运行动作
    public abstract void run();
    // 电梯停止运行
    public abstract void stop();

}
