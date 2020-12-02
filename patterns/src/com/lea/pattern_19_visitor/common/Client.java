package com.lea.pattern_19_visitor.common;

/**
 * @author lzc
 * @create 2020-12-2 10:42
 */
public class Client {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            // 获得元素对象
            Element element = ObjectStructure.createElement();
//            接受访问者访问
            element.accept(new Visitor());
        }
    }
}
