package com.lea.pattern_14_iterator.common;

import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;

/**
 * @author lzc
 * @create 2020-11-21 15:28
 */
public class Client {

    public static void main(String[] args) {
        // 声明容器
        Aggregate<Integer> ints = new ConcreteAggregate<>();
        // 生产数据，放进容器中共
        ints.add(6);
        ints.add(3);
        ints.add(2);
        ints.add(1);
        // 获得迭代器，遍历一下

        // 简单说来。迭代器类似于数据库中的游标，可以在一个容器内上下翻滚，遍历所有需要查看的元素
        Iterator<Integer> iterator = ints.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }
    }
}
