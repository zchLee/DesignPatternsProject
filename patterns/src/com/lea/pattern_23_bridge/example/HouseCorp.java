package com.lea.pattern_23_bridge.example;

/**
 * @author lzc
 * @create 2020-12-6 17:14
 * 房地产公司
 */
public class HouseCorp extends Corp {
    public HouseCorp(House house) {
        super(house);
    }

    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚大钱了");
    }
}
