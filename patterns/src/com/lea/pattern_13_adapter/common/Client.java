package com.lea.pattern_13_adapter.common;

/**
 * @author lzc
 * @create 2020-11-20 11:44
 */
public class Client {

    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapter = new Adapter();
        adapter.request();

    }
}
