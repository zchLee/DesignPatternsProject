package com.lea.pattern_4_templatemethod.car;

/**
 * @author lzc
 * @create 2020-11-10 15:33
 */
public abstract class HummerModel {
    // 启动悍巴马模型，不管是手摇还是电力都要启动
    protected abstract void start();
    // 停车
    protected abstract void stop();
    // 喇叭发出声音
    protected abstract void alarm();
    // 引擎哄隆隆的响
    protected abstract void engineBoom();

    // 模型跑起来
    final public void run() {
        start();
        engineBoom();
        // 喇叭太吵了，得让他响的时候才能响
//        alarm();
        if (isAlarm()) {
            alarm();
        }
        stop();
    }

    // 钩子方法，默认喇叭是回响的
    protected boolean isAlarm() {
        return true;
    }
}
