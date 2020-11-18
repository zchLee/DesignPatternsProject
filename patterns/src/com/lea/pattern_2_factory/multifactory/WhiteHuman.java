package com.lea.pattern_2_factory.multifactory;

/**
 * @author lzc
 * @create 2020-11-6 15:07
 * 人产品的 白人具体实现
 */
public class WhiteHuman extends Human {
    @Override
    public void getColor() {
        System.out.println("白人，白白的");
    }

    @Override
    public void talk() {
        System.out.println("说的字母话");
    }
}
