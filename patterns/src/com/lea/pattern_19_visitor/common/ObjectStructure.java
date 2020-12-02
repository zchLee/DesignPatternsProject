package com.lea.pattern_19_visitor.common;

import java.util.Random;

/**
 * @author lzc
 * @create 2020-12-2 10:40
 */
public class ObjectStructure {

//    采用工厂模式，封装数据对象
    public static Element createElement() {
        Random random = new Random();
        if (random.nextInt(100) > 50)
            return new ConcreteElement1();
        return new ConcreteElement2();
    }
}
