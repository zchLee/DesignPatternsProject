package com.lea.pattern_4.car;

/**
 * @author lzc
 * @create 2020-11-10 15:40
 */
public class HummerH1Model extends HummerModel {
    private boolean alarmFlag = true;  // 要响喇叭
    @Override
    protected void start() {
        System.out.println("悍巴马H1启动");
    }

    @Override
    protected void stop() {
        System.out.println("悍巴马H1停车");
    }

    @Override
    protected void alarm() {
        System.out.println("悍巴马H1鸣笛。。boom！boom！");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍巴马引擎发动....");
    }

    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    // 要不要鸣笛 由客户来决定
    public void setAlarm(boolean isAlarm) {
        this.alarmFlag = isAlarm;
    }
}
