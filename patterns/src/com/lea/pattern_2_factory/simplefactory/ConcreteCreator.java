package com.lea.pattern_2_factory.simplefactory;

import com.lea.pattern_2_factory.factory.Product;

/**
 * @author lzc
 * @create 2020-11-6 14:38
 * 简单工厂模式实现
 */
public class ConcreteCreator {

    // Product: 复用工厂模式中的 产品类
    public static <T extends Product> T createProduct(Class<T> clazz) {
        T t = null;
        try {
            t = clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }
}
