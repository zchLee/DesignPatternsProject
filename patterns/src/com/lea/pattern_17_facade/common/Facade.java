package com.lea.pattern_17_facade.common;

/**
 * @author lzc
 * @create 2020-11-25 10:36
 */
public class Facade {

    // 被委托的对象
    private ClassA a = new ClassA();
    private ClassB b = new ClassB();
    private ClassC c = new ClassC();
    private Context context = new Context();

    // 提供外部访问的方法
    public void methodA() {
        this.a.doSomethingA();
    }

    public void methodB() {
        this.b.doSomethingB();
    }

    // 提供外部访问方法
    public void methodBC() {
//      这样是不允许的，门面类只提供访问路径，不参与子系统逻辑处理，将这个方法封装起来，委托给门面对象使用
//        this.b.doSomethingB();
//        this.c.doSomethingC();
        // 门面只提供访问路劲，就对了
        context.complexMethod();
    }
}
