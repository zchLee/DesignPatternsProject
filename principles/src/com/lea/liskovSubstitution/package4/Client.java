package com.lea.liskovSubstitution.package4;

/**
 * @author lzc
 * @create 2020-10-18 16:02
 *
 * 如果父类的一个方法返回值是一个类型T，子类的相同方法（重载或重写）的返回值是S，那么里士替换原则就要求S必须小于或等于T
 * 也就是说S要么和T是同一个类型，要么S是T类型的子类
 *
 * 如果子类的返回结果宽于父类的返回值结果，是不会被调用的
 *
 */
public class Client {
}
