package com.lea.pattern_23_bridge.example;

/**
 * @author lzc
 * @create 2020-12-6 17:11
 */
public class IPad extends Product {
    @Override
    public void beProduced() {
        System.out.println("生产ipad...");
    }

    @Override
    public void beSell() {
        System.out.println("销售ipad...");
    }
}
