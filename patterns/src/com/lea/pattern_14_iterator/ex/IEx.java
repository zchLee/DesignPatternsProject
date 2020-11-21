package com.lea.pattern_14_iterator.ex;

/**
 * @author lzc
 * @create 2020-11-21 14:22
 */
public interface IEx {
    // 添加前女友
    void add(int num, String name, int age);
    // 看到前女友信息
    String getExInfo();
    // 获得一个可遍历对象
    IExIterator iterator();


}
