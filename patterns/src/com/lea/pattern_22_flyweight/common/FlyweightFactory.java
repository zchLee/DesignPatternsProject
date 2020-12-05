package com.lea.pattern_22_flyweight.common;

import java.util.HashMap;

/**
 * @author lzc
 * @create 2020-12-5 15:51
 * 享元工厂
 */
public class FlyweightFactory {
    // 享元工厂必须有的 池容器
    private static HashMap<String, Flyweight> pool = new HashMap<>();
    // 享元工厂 获得享元对象
    public static Flyweight getFlyweight(String Extrinsic) {
        // 需要返回的享元对象
        Flyweight flyweight = null;
        // 在池中没有该对象
        if (pool.containsKey(Extrinsic)) {
            flyweight = pool.get(Extrinsic);
        } else {
            flyweight = new ConcreteFlyweight(Extrinsic);
            pool.put(Extrinsic, flyweight);
        }
        return flyweight;
    }

}
