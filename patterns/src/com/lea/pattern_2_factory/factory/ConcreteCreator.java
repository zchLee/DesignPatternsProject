package com.lea.pattern_2_factory.factory;

/**
 * @author lzc
 * @create 2020-11-6 10:57
 * 提供具体实现 创建工厂，生产产品
 */
public class ConcreteCreator extends Creator {

    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        T t = null;
        try {
            t = c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }
}
