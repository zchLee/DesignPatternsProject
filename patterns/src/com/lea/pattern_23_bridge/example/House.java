package com.lea.pattern_23_bridge.example;

/**
 * @author lzc
 * @create 2020-12-6 17:10
 */
public class House extends Product {
    @Override
    public void beProduced() {
        System.out.println("生产房子..");
    }

    @Override
    public void beSell() {
        System.out.println("卖房子...");
    }
}
