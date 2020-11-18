package com.lea.pattern_2_factory.multifactory;

/**
 * @author lzc
 * @create 2020-11-6 15:08
 * 黑种人
 */
public class BlackHuman extends Human {
    @Override
    public void getColor() {
        System.out.println("皮肤黑黑的");
    }

    @Override
    public void talk() {
        System.out.println("我也不知道说什么话");
    }
}
