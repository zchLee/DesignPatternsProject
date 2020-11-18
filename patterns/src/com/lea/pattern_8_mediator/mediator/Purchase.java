package com.lea.pattern_8_mediator.mediator;

/**
 * @author lzc
 * @create 2020-11-16 10:08
 * 采购类
 */
public class Purchase extends AbstractColleague {

    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

//    public void buyComputer(int number) {
//        Stock stock = new Stock(); // 访问库存
//        Sale sale = new Sale(); // 访问销售
//        int saleStatus = sale.getSaleStatus(); // 获取销售情况
//        if (saleStatus > 80) {
//            System.out.println("采购电脑" + number + "台");
//        }else {
//            // 销售情况不好 折半采购
//            number = number / 2;
//            System.out.println("采购电脑" + number + "台");
//        }
//        stock.increase(number);
//    }

    // 改造后的采购电脑方法
    public void BuyComputer(int num) {
        super.mediator.execute("purchase.buy", num);
    }

    // 不再采购电脑
    public void refuseBuyIBM() {
        System.out.println("不再采购IBM电脑");
    }
}
