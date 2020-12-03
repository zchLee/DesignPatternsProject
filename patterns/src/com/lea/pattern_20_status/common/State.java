package com.lea.pattern_20_status.common;

/**
 * @author lzc
 * @create 2020-12-3 15:52
 * 抽象环境变量
 */
public abstract class State {

    // 定义环境变量，提供子类访问
    protected Context context;
    // 设置环境角色
    public Context getContext() {
        return context;
    }
    public void setContext(Context context) {
        this.context = context;
    }

    // 不同行为
    public abstract void handle1();
    public abstract void handle2();
}
