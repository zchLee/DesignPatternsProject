package com.lea.pattern_5_buider.buider;

/**
 * @author lzc
 * @create 2020-11-11 11:02
 */
public class BenzModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("奔驰车启动");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰车停下来");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰车发出喇叭声");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰车引擎轰鸣");
    }
}
