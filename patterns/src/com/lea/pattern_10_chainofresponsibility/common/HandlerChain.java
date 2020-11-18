package com.lea.pattern_10_chainofresponsibility.common;

/**
 * @author lzc
 * @create 2020-11-18 11:19
 */
public class HandlerChain {

    // 封装链条，返回第一个节点对象，方便调用
    public static Handler getHandlerChain() {
        // 声明所有节点
        Handler c1 = new ConcreteHandler_1();
        Handler c2 = new ConcreteHandler_2();
        // 设置责任链的顺序 1-2
        c1.setNextHandler(c2);
        return c1;
    }
}
