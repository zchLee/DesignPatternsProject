package com.lea.interfaceIsolation;

/**
 * @author lzc
 * @create 2020-10-27 09:56
 * 接口隔离：
 *  了解接口隔离之前 要了解两种接口：
 *      实例接口（Object interface）：在java类中，通过new 产生的一个实例
 *      类接口（Class interface）： interface关键字定义的接口
 *   定义：
 *      1.clients should not be forced to depend upon interfaces that they don't used;
 *      (客服端不应该依赖它不需要的接口)
 *      2.The dependency of one class to another one should depend on the smallest possible interface;
 *      (类间的依赖关系应该在最小的接口上)
 *
 *   乍一看接口隔离和 单一职责 似乎挺相似，其实不然，单一职责关注职责，接口隔离关注接口之间的关系，尽可能小的粒度
 *   而拆分接口时，首先要满足单一职责
 */
public class Main {
}
