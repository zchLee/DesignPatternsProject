package com.lea.pattern_23_bridge.common;

/**
 * @author lzc
 * @create 2020-12-6 22:10
 */
public class RefinedAbstraction extends Abstraction {
    // 覆写构造函数
    public RefinedAbstraction(Implementor impl) {
        super(impl);
    }

    // 修正父类行为，变成自己特有的行为
    @Override
    public void request() {
        System.out.println("特有处理方法噶");
        super.request();
    }
}
