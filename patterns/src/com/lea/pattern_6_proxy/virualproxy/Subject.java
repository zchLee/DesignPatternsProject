package com.lea.pattern_6_proxy.virualproxy;

/**
 * @author lzc
 * @create 2020-11-12 10:18
 * 抽象主题角色
 *  可以是接口也可以是抽象类，是一个最普通的业务类型定义，无特殊要求
 */
public interface Subject {
    // 定义方法
    void request();
}
