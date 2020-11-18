package com.lea.pattern_8_mediator.mediator;

import java.util.Random;

/**
 * @author lzc
 * @create 2020-11-16 10:09
 * 销售类
 */
public class Sale extends AbstractColleague {

    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

//    public void sellComputer(int number) {
//        // 访问库存
//        Stock stock = new Stock();
//        // 访问采购
//        if (stock.getStockNumber() < number) {
////            System.out.println("库存不足");
//            super.mediator.purchase.buyComputer(number);
//        }
//        System.out.println("销售IBM电脑" + number + "台");
//        stock.decrease(number);
//    }

    // 改造后的 销售方法
    public void sellComputer(int number) {
       super.mediator.execute("sale.sell", number);
        System.out.println("销售了" + number);
    }

    public int getSaleStatus() {
        Random random = new Random();
        int i = random.nextInt(100);
        System.out.println("电脑的销售情况是：" + i);
        return i;
    };

    // 折价销售
    public void offSale() {
        super.mediator.execute("sale.offSell");
    }
}
