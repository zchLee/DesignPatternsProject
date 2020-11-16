package com.lea.pattern_8.mediator;

/**
 * @author lzc
 * @create 2020-11-16 10:09
 * 库存类
 */
public class Stock extends AbstractColleague {
    // 刚开始有100台
    private static int COMPUTER_NUMBER = 100;

    public Stock(AbstractMediator mediator) {
        super(mediator);
    }

    // 库存增加
    public void increase(int number) {
        COMPUTER_NUMBER += number;
        System.out.println("库存数量是：" + COMPUTER_NUMBER);
    };

    // 出库
    public void decrease(int number) {
        COMPUTER_NUMBER -= number;
        System.out.println("库存数量为：" + COMPUTER_NUMBER);
    };

    // 获得库存数量
    public int getStockNumber() {
        return COMPUTER_NUMBER;
    }

    // 存货压力大了，要求采购人员不要采购，销售人员要尽快销售
    public void clearStock() {
        System.out.println("清理库存的数量为：" + COMPUTER_NUMBER);
        super.mediator.execute("stock.clear");
    }
}
