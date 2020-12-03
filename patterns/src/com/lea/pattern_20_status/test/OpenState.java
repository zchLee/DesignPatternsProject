package com.lea.pattern_20_status.test;

/**
 * @author lzc
 * @create 2020-12-3 14:43
 */
public class OpenState extends LiftState {
    @Override
    public void open() {
        System.out.println("电梯门开启...");
    }

    @Override
    public void close() {
//        、、
        System.out.println("电梯门关闭");
    }

    @Override
    public void run() {
        // 不做操作
    }

    @Override
    public void stop() {
        // 不做操作
    }
}
