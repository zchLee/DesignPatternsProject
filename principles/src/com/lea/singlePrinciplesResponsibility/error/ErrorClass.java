package com.lea.singlePrinciplesResponsibility.error;

/**
 * @author lzc
 * @create 2020-10-18 11:21
 * 什么是单一职责原则：
 *  有且只有一个改变类的原因
 * 从这个原则看下面的就会发现，他并不符合单一原则
 * 问题描述：拨号和结束通话符合 连接协议，通话属于数据传输
 * 解决思路，将连接协议抽象成一个ConnectionManagement、数据传输抽象成一个DataTrans,对应的使用一个功能类继承这两个接口，
 */
public interface ErrorClass {

    // 拨号
    void dial(String phoneNumber);

    // 通话
    void chat(Object o);

    // 结束通话
    void hangup();


}
