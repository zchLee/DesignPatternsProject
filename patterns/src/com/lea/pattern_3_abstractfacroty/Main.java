package com.lea.pattern_3_abstractfacroty;

import com.lea.pattern_3_abstractfacroty.abstractfactory.AbstractCreator;
import com.lea.pattern_3_abstractfacroty.abstractfactory.AbstractProductA;
import com.lea.pattern_3_abstractfacroty.abstractfactory.AbstractProductB;
import com.lea.pattern_3_abstractfacroty.abstractfactory.Creator_1;
import com.lea.pattern_3_abstractfacroty.abstractfactory.Creator_2;

/**
 * @author lzc
 * @create 2020-11-9 10:02
 * 
 * 抽象工厂方法：
 *      为创建一组相关或相互依赖的对象提供一个接口，而且无需指定它们的具体类
 *
 *  在多个业务品种、业务分类中，通过抽象工厂模式产生需要的对象是一种非常好的解决业务。
 *
 *  注意：有M个产品等级，就要有M个等级工厂，在每个实现工厂中，实现不同产品族的生产任务
 *
 * 优点：封装、易用
 * 缺点：扩展产品难，还会破坏 抽象工厂的开闭原则
 *
 * 使用场景：
 *      一个对象族（或一组没有任何关系的对象）都有相同的约束，则可以使用抽象工厂。
 *      它对扩展产品困难，但是对扩展产品级别却非常容易，横向看是符合开闭原则的
 */
public class Main {

    public static void main(String[] args) {
        // 定义出两个工厂
        AbstractCreator creator1 = new Creator_1();
        AbstractCreator creator2 = new Creator_2();
        // 产生A1对象
        AbstractProductA productA1 = creator1.creatorProductA();
        // 产生A2对象
        AbstractProductA productA2 = creator2.creatorProductA();
        // 产生B1对象
        AbstractProductB productB1 = creator1.creatorProductB();
        // 产生B2对象
        AbstractProductB productB2 = creator2.creatorProductB();

        // 得到不同等级的 产品，组装起来
    }
}
