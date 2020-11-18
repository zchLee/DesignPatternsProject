package com.lea.pattern_4_templatemethod.templatemethod;

/**
 * @author lzc
 * @create 2020-11-10 11:26
 *
 * 抽象模板类
 */
public abstract class AbstractTemplate {
    // 基本方法
    public abstract void firstThing();
    // 基本方法
    public abstract void secondThing();
    // 基本方法
    public abstract void thirdThing();

    // 为了防止恶意的操作，模板方法都加上final关键字，不允许被覆写
    // 模板方法
    public final void run() {
        System.out.println("将大目标分为几个小目标");
        firstThing();
        secondThing();
        thirdThing();
        System.out.println("几个小目标完成后，大目标也就完成了");
    }
}
