package com.lea.pattern_5_buider;

import com.lea.pattern_5_buider.customize.ConcreteBuilder;

/**
 * @author lzc
 * @create 2020-11-11 09:45
 * 建造者模式(builder pattern)
 *      将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 *
 * 优点：
 *  封装性：使用建造者可以使客户端不必知道产品内部组成的细节。
 *  建造者独立，易扩展：建造者之间互相独立，对系统的扩展非常有利
 *  便于控制细节风险：由于建造者是独立的，因此可以对建造者过程逐步细化，而不对其他的模块产生任何的影响
 *
 * 使用场景：
 *  1、相同的方法，不同的执行顺序，产生不同的事件结果时
 *  2、多个部件或零件，都可以装配到一个对象，但是可以产生不同的运行结果时，则可以使用建造者模式
 *  3、产品类非常复杂，或者产品类中的调用顺序不同产生了不同的效果，这个时候使用建造者模式非常合适
 *  4、在对象创建过程中会使用其他到其他系统中的一些对象，这些对象在产品对象的创建过程中不易得到时，也可以采用建造者模式来
 *  封装该对象的创建过程
 *
 * 注意点：
 *      建造者模式关注的是 零件的装配顺序，这是与工厂模式最大的区别。工厂模式关注的是对象的构建
 */
public class BuilderMain {

    public static void main(String[] args) {
//        Director director = new Director();
//        director.getABenzModel().run();
//        director.getBBenzModel().run();
//        director.getCBenzModel().run();
//        director.getDBenzModel().run();

        // 初步 构造器
//        ConcreteBuilder builder = new ConcreteBuilder();
//        builder.builderSite();
//        builder.builderFrame();
//        builder.builderTire();
//        Bike bike = builder.createBike();
        // 改造之后的 构造器
        ConcreteBuilder builder = new ConcreteBuilder();
        builder.createBike();
    }
}
