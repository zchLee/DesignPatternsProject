package com.lea.pattern_11_decorator.common;

/**
 * @author lzc
 * @create 2020-11-19 10:44
 */
public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void baseOperate() {
        super.baseOperate();
        decorator2();
    }

    private void decorator2() {
        System.out.println("the decorator method 2...");
    }
}
