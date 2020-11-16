package com.lea.pattern_8.mediator;

/**
 * @author lzc
 * @create 2020-11-16 11:10
 * 生产 销售 库存 场景类
 */
public class Client {

    public static void main(String[] args) {
        AbstractMediator mediator = new ConcreteMediator();
        // 采购人员采购电脑
        System.out.println("----------采购人员采购电脑------------");
        Purchase purchase = new Purchase(mediator);
        purchase.BuyComputer(90);

        // 销售人员销售电脑
        System.out.println("\n----------销售人员销售电脑------------");
        Sale sale = new Sale(mediator);
        sale.sellComputer(2);

        // 库房管理管理库存
        System.out.println("\n----------库房管理人员清仓处理------------");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
