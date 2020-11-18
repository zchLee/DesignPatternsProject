package com.lea.pattern_6_proxy.proxy;

/**
 * @author lzc
 * @create 2020-11-12 11:46
 */
public class Client {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Proxy proxy = new Proxy(subject);
        proxy.request();
    }
}
