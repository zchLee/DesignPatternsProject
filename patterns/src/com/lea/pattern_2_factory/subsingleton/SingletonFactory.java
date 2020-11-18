package com.lea.pattern_2_factory.subsingleton;

import java.lang.reflect.Constructor;

/**
 * @author lzc
 * @create 2020-11-6 15:55
 *
 * 通过工厂模式 创建对象
 *
 */
public class SingletonFactory {

    private static Singleton instance;

    static {
        // 通过反射获取对象
        try {
            Class<?> clazz = Class.forName(Singleton.class.getName());
            Constructor constructor = clazz.getDeclaredConstructor();// 获取无参构造器
            constructor.setAccessible(true);  // 设置无参构造器可以访问
            instance = (Singleton) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Singleton getSingleton() {
        return instance;
    }
}
