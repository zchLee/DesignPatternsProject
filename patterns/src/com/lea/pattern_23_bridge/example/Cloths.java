package com.lea.pattern_23_bridge.example;

/**
 * @author lzc
 * @create 2020-12-6 21:48
 */
public class Cloths extends Product {
    @Override
    public void beProduced() {
        System.out.println("做衣服：..");
    }

    @Override
    public void beSell() {
        System.out.println("卖衣服,,");
    }
}
