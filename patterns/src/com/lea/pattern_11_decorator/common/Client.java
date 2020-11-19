package com.lea.pattern_11_decorator.common;

/**
 * @author lzc
 * @create 2020-11-19 10:46
 */
public class Client {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        // 第一次修饰
        component = new ConcreteDecoratorA(component);
        // 第二次修饰
        component = new ConcreteDecoratorB(component);
        // 修饰后运行 在修饰过程中，可以对最基本的进行改造包装
        component.baseOperate();
    }
}
