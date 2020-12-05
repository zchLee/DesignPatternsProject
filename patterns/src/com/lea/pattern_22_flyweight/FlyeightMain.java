package com.lea.pattern_22_flyweight;

/**
 * @author lzc
 * @create 2020-12-5 14:49
 * 享元模式：
 *  是池技术的重要实现方式，其定义如下
 *      使用共享对象可有效地支持大量的细粒度的对象。
 *  要求细粒度对象，那么不可避免的使得对象数量多且性质相近，那将这些对象的信息分为两个部分：
 *  内部状态（intrinsic）和外部状态(extrinsic)
 *      内部状态：
 *          是对象可以共享出来的，存储在享元对象内部并且不会随环境改变而改变。
 *      外部状态：
 *          外部状态是对象得以依赖的一个标记，是随着环境改变而改变的，不可以共享的状态
 *  角色：
 *      Flyweight---抽象享元角色
 *          是一个抽象类，同时定义出对象的外部和内部状态的实现或接口
 *      ConcreteFlyweight---具体享元角色
 *          具体的，事项抽象角色定义的业务。该角色中需要注意的是内部状态处理应该与环境无关，不能出现一个操作改变了
 *          内部状态，同时修改了外部状态
 *      unsharedConcreteFlyweight---不可共享的享元角色
 *          不存在外部状态或者安全要求（如线程安全）不能使用共享技术的对象，该对象一般不会出现在享元工厂中
 *      FlyweightFactory---享元工厂
 *          职责非常简单，就是构造一个池容器，同时提供从池中获的对象的方法
 *   享元模式的目的在于运用共享技术，使得一些细粒度的对象可以共享，我们的设计确实也该如此，多使用细粒度的对象，便于重用或重构
 *
 */
public class FlyeightMain {
}
