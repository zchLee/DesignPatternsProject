package com.lea.pattern_2_factory;

import com.lea.pattern_2_factory.factory.ConcreteCreator;
import com.lea.pattern_2_factory.factory.ConcreteProduct;
import com.lea.pattern_2_factory.factory.Creator;
import com.lea.pattern_2_factory.multifactory.Human;
import com.lea.pattern_2_factory.multifactory.HumanFactory;

/**
 * @author lzc
 * @create 2020-11-6 10:41
 * 工厂方法模式定义：
 *      定义一个用于创建 对象的结构，具体决定实例化哪个类由子类决定。工厂方法使一个类的实例化延迟到其子类。
 * 在工厂方法中，抽象产品Product负责定义产品共性，实现对事务最抽象的的定义；Creator为抽象创建类，也就是抽象工厂，
 *      具体如何创建产品类，是由具体的实现工厂ConcreteCreator完成
 *
 * 工厂模式优点：
 *  1.良好的封装性，代码结构清晰。一个对象的创建是有条件约束的，如一个调用者需要一个具体的产品对象，只要知道产品对象的字节码就够了
 *  2.扩展性非常优秀，在增加产品类的情况下，只要适当修改具体的工厂类或扩展一个工厂类，就可以拥抱变化
 *  3.屏蔽产品类，这点很重要，产品类的实现无论如何变化，调用者都不需要关心，他只需要关心产品的接口，只要接口保持不变，
 *      系统中的上层模块就不会发生变化。因此产品的实例化工作是由工厂类负责的，一个具体产品对象由哪个产品生成由工厂类决定。
 *      * 在数据库开发中，JDBC连接数据库，从MySQL转到Oracle，只需要改动驱动名称就可以连接数据库，其他的都不用改，
 *      这就是工厂模式灵活性的一个经典案例
 *  4.典型的解耦框架，高层次只需要知道抽象类，其他的实现都不用知晓，符合迪米特法则，也符合依赖倒置，只依赖产生产品的抽象；
 *      也符合里士替换原则，使用产品子类替换抽象产品
 *
 *  使用场景：
 *      工厂方法模式是new一个对象的替代品，所以在需要生成对象的时候都可以使用，但是需要慎重地考虑是否需要增加一个工厂类
 *      进行管理，增加代码的复杂度。
 *      其次，需要灵活的、可扩展的框架时，可以考虑采用工厂模式
 *
 *  工厂模式的扩展：
 *      1.缩小为简单工厂模式 见 factory 包
 *          一个模块只需要一个工厂时，没必要把它产生出来，使用静态的方法就可以。根据将 工厂写成入 simpleFactory包下的
 *      2.升级为多个工厂类 见 multifactory 包
 *          当我们在做一个比较复杂的项目时，经常会遇到初始化一个对象很耗费精力的情况，所有的产品类都放在一个工厂方法中进行
 *              初始化会使代码结构不清晰。例如，一个产品类有5个具体实现，每个实现类的初始化（new一个对象，并赋值）方法都不同，
 *              如果写在一个工厂方法中，势必会导致该方法巨大无比，那该怎么解决呢？
 *          考虑到需要结构清晰，我们就为每一个产品定义一个创造者，然后由调用者自己去选择与哪个工厂方法关联。
 *          这次以女娲造人为例 multifactory 包下，解释说明
 *          注意：在复杂的工厂应用中，一般采用多工厂的方法，然后再增加一个协调类，避免调用者与各个子工厂交流，协调类的作用
 *          是封装子工厂类，对高层模块提供统一的访问接口
 *      3.替代单例模式 见 subsingleton 包
 *          单例的核心要求就是内存中只有一个对象，通过工厂方法模式也可以只在内存中生成一个对象
 *      4.延迟初始化 见 lazyinit 包
 *          什么是延迟初始化？一个对象被消费完毕后，并不立刻释放，工厂类保持其初始状态，等待再次调用。
 */
public class Main {

    public static void main(String[] args) {
        // 这是一个最基本的工厂方法模式
        Creator factory = new ConcreteCreator();
        ConcreteProduct product = factory.createProduct(ConcreteProduct.class);
        product.method();

        // 简单的工厂模式
        ConcreteProduct productBySimpleFactory = com.lea.pattern_2_factory.simplefactory.ConcreteCreator.createProduct(ConcreteProduct.class);
        productBySimpleFactory.method();

        // 多工厂模式
//        Human yellowHuman = new YellowHumanFactory().createHuman(); // 创建黄种人对象
//        Human whiteHuman = new WhiteHumanFactory().createHuman(); // 创建白种人对象
//        Human blackHuman = new BlackHumanFactory().createHuman(); // 创建白种人对象
        // 多工厂模式 通过协调器来调用
        Human yellowHuman = HumanFactory.createYellowHuman();
        Human whiteHuman = HumanFactory.createWhiteHuman();
        Human blackHuman = HumanFactory.createBlackHuman();
    }
}
