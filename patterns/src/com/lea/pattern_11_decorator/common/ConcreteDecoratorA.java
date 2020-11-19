package com.lea.pattern_11_decorator.common;

/**
 * @author lzc
 * @create 2020-11-19 10:43
 */
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void baseOperate() {
        decorator1();
        super.baseOperate();
    }

    private void decorator1 () {
        System.out.println("修饰方法1");
    }
}
