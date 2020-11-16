package com.lea.pattern_8.mediator;

import java.util.function.Supplier;

/**
 * @author lzc
 * @create 2020-11-16 10:15
 * 具体抽象方法
 */
public class ConcreteMediator extends AbstractMediator {

    // 中介者最终要的方法
    @Override
    public void execute(String str, Object... objects) {
        if ("purchase.buy".equalsIgnoreCase(str)) { // 采购电脑
            this.buyComputer((int) objects[0]);
        } else if ("sale.sell".equalsIgnoreCase(str)) { // 销售电脑
            this.sellComputer((int) objects[0]);
        } else if ("sale.offSell".equalsIgnoreCase(str)) { // 折价销售电脑
            this.offSell();
        } else if ("stock.clear".equalsIgnoreCase(str)) { // 清仓处理
            this.clearStock();
        }
    }
    // 采购电脑
    private void buyComputer(int number) {
        int saleStatus = super.sale.getSaleStatus(); // 获取销售情况
        if (saleStatus > 80) {
            System.out.println("采购电脑" + number + "台");
        }else {
            // 销售情况不好 折半采购
            number = number / 2;
            System.out.println("采购电脑" + number + "台");
        }
        super.stock.increase(number);
    }

    // 销售电脑
    private void sellComputer(int number) {
        if (super.stock.getStockNumber() < number) {
            super.purchase.BuyComputer(number);
        }
        super.stock.decrease(number);
    }

    // 折价销售电脑
    private void offSell() {
        System.out.println("折价销售IBM电脑" + stock.getStockNumber() + "台");
    }

    // 清仓处理
    private void clearStock() {
        super.sale.offSale();  // 折价销售
        super.purchase.refuseBuyIBM();  // 停止采购
    }
}
