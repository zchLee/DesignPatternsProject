package com.lea.pattern_1.singleton;

/**
 * @author lzc
 * @create 2020-11-5 10:22
 */
public class Singleton {
    // 限制产生多个对象
    private Singleton() {}

    // 饿汉 单例模式 是线程安全的
//    private static final Singleton instance = new Singleton();
//
//    public static Singleton getInstance() {
//        return instance;
//    }


    // 懒汉模式，线程安全的实现方式
    private volatile static Singleton instance = null;

    public static Singleton getInstance() {
        if (null == instance) {
            synchronized (Singleton.class) {
                if (null == instance) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
