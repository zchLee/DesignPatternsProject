package com.lea.pattern_23_bridge.example;

/**
 * @author lzc
 * @create 2020-12-6 17:12
 * 抽象公司类
 */
public abstract class Corp {
    // 定义一个抽象产品对象
    private Product product;

    public Corp(Product product) {
        this.product = product;
    }

    // 公司怎么赚钱啊
    public void makeMoney() {
        // 生产
        this.product.beProduced();
        // 销售
        this.product.beSell();
    }
}
