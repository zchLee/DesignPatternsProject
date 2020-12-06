package com.lea.pattern_23_bridge;

import com.lea.pattern_23_bridge.common.ConcreteImplementor;
import com.lea.pattern_23_bridge.common.RefinedAbstraction;

/**
 * @author lzc
 * @create 2020-12-6 21:51
 * 桥接模式，也叫桥梁模式
 *      将抽象和实现解耦，使得两者可以独立变化。
 *      桥接模式的重点在“解耦”上，如何让他们两者解耦是要了解的重点
 * 角色
 *      Abstraction  抽象化角色
 *          它的主要职责是定义了该角色的行为，同时保存一个对实现化角色的引用。该角色一般是抽象的
 *      Implementor  实现化角色
 *          它是接口或者抽象类，定义角色必须有的行为和属性
 *      RefinedAbstraction  修正抽象化角色
 *          它引用实现化角色对抽象化角色进行修正
 *      ConcreteImplementor 具体实现化角色
 *          实现接口或抽象类定义的方法和属性。
 *   这么解释挺绕口的，这么说吧。抽象角色引用实现角色，或者说抽象角色的部分实现是由实现角色完成的。
 *
 *  使用场景：
 *      1.不希望或者不适应使用继承的场景
 *      2.接口或抽象类不稳定的场景
 *      3.重用性要求高的场景
 *  注意事项：
 *      桥接模式非常简单，使用该模式主要考虑如何拆分抽象和实现，并不是一涉及继承就要考虑使用该模式，那还要继承干嘛。
 *      桥接模式的意图还是对变化的封装，尽量把可能变化的因素封装到最细、最小的逻辑单元，避免风险扩散。因此，在类的继承
 *      有N层时，可以考虑使用桥接模式
 *
 */
public class BridgeMain {

    public static void main(String[] args) {
        RefinedAbstraction refinedAbstraction = new RefinedAbstraction(new ConcreteImplementor());
        refinedAbstraction.request();
    }
}
