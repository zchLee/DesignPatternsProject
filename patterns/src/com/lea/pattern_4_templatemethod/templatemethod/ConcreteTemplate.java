package com.lea.pattern_4_templatemethod.templatemethod;

/**
 * @author lzc
 * @create 2020-11-10 11:30
 *
 * 具体抽象方法
 */
public class ConcreteTemplate extends AbstractTemplate {
    @Override
    public void firstThing() {
        System.out.println("做第一件事");
    }

    @Override
    public void secondThing() {
        System.out.println("做第二件事");
    }

    @Override
    public void thirdThing() {
        System.out.println("做第三件事");
    }
}
