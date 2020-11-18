package com.lea.pattern_6_proxy.proxy;

/**
 * @author lzc
 * @create 2020-11-12 10:21
 * 代理类，也被称为代理类、委托类
 *      负责对真实角色的应用，把所有抽象主题定义的方法限制委托给具体主题实现类实现，
 *      并且在真实主题处理完毕后，做预处理和善后处理的工作
 *  优点：
 *      职责清晰：
 *          真实的角色就是实现具体业务逻辑，不用关心其他非本职的事务，通过后期的代理完成一项事务，
 *          附带的结构也是编程简洁清晰
 *      高扩展性：
 *          具体主题实现类随时都会发生变化，只要它实现了接口，那么就逃不过接口方法的显示，代理类完全不用做任何修改
 *
 */
public class Proxy implements Subject,IProxy {
    // 代理具体的实现类
    private Subject proxy;

    public Proxy(Subject proxy) {
        if (null == proxy) {
            // 如果没有具体代理类，给一个默认具体主题实现类
            this.proxy = new ConcreteSubject();
        }else {
            this.proxy = proxy;
        }
    }

    @Override
    public void request() {
        before();
        proxy.request();
        after();
        count();
    }
    // 预处理
    private void before(){
        // do what？
    }
    // 善后处理
    private void after() {
        // do what？
    }

    @Override
    public void count() {
        System.out.println("处理完就收钱。收款一百元");
    }
}
