package com.lea.pattern_5.buider;

import sun.security.x509.AVA;

import java.util.ArrayList;

/**
 * @author lzc
 * @create 2020-11-11 10:41
 * 汽车模型抽象类 - 产品类
 */
public abstract class CarModel {
    // 汽车执行顺序
    private ArrayList<String> sequence = new ArrayList<>();
    // 汽车启动
    protected abstract void start();
    // 汽车停止
    protected abstract void stop();
    // 汽车喇叭滴滴滴
    protected abstract void alarm();
    // 汽车引擎发动
    protected abstract void engineBoom();

    // 模型按照步骤启动
    public final void run() {
        for (int i = 0; i < sequence.size(); i++) {
            String actionName = sequence.get(i);
            if ("start".equalsIgnoreCase(actionName)) {
                this.start();
            }
            if ("stop".equalsIgnoreCase(actionName)) {
                this.stop();
            }
            if ("alarm".equalsIgnoreCase(actionName)) {
                this.alarm();
            }
            if ("engineBoom".equalsIgnoreCase(actionName)) {
                this.engineBoom();
            }
        }
    }

    public final void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }

}
