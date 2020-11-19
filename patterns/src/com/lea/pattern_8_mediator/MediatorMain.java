package com.lea.pattern_8_mediator;

/**
 * @author lzc
 * @create 2020-11-16 10:07
 * 中介者模式：
 *          用一个中介对象封装一系列的对象交互，中介者使对象不需要显示地相互作用，从而使其耦合松散，
 *     而且可以独立的改变它们之间的交互
 * 由哪几部分组成？
 *      Mediator:中介者
 *          抽象中介者角色定义统一的接口，用于各同事之间的沟通
 *      ConcreteMediator：具体中介者角色
 *          具体中介者通过协调各同事角色实现协作行为，因此它必须依赖于各个同事角色
 *      Colleague：同事角色
 *          每一个同事角色都知道中介者角色，而且与其他的同事角色通信的时候，一定要通过中介者角色协调。
 *          每个同事类的行为分为两种，
 *              一种是同事类本身的行为，比如改变对象本身的状态，处理自己的行为等，这种
 *                  叫自发行为（self-method），与其他的同事类或中介者没有任何的依赖；
 *              另一种：必须依赖中介者才能完成的行为，叫做依赖方法（Dep-method）
 *
 * 优点：
 *      1.减少了类的依赖，把原有的对象依赖变成一对一的依赖，同事类只依赖中介者，减少依赖，降低类的耦合
 * 缺点：
 *      中介者类，方法会越来越庞大，逻辑复杂，
 *
 * 实际应用过：
 *  中介者模式简单，但不表示容易使用，中介者模式也叫 调停者模式。一个对象要和多个对象交互，就像对象间的战争，很混乱，这时需要加入一个中心，所有类和
 *  中心交流，中心说怎么处理就怎么处理
 */
public class MediatorMain {
}