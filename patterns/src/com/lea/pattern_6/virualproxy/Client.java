package com.lea.pattern_6.virualproxy;

import com.sun.xml.internal.messaging.saaj.soap.SOAPVersionMismatchException;

/**
 * @author lzc
 * @create 2020-11-12 11:47
 *
 * 虚拟代理：
 *  在代理类实现方法中判断主题对象是否被创建，没有就创建，这就是虚拟代理
 */
public class Client {

    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.request();
    }
}
