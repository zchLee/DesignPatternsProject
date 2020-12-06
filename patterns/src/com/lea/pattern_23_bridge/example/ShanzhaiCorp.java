package com.lea.pattern_23_bridge.example;

/**
 * @author lzc
 * @create 2020-12-6 17:16
 */
public class ShanzhaiCorp extends Corp {
    public ShanzhaiCorp(Product product) {
        super(product);
    }

    public void makeMoney() {
        super.makeMoney();
        System.out.println("山寨公司也赚钱了..");
    }
}
