package com.lea.pattern_9_chainofresponsibility.common;

/**
 * @author lzc
 * @create 2020-11-18 11:06
 */
public class ConcreteHandler_1 extends Handler {
    @Override
    protected Level getHandlerLevel() {
        return Level.ONE;
    }

    @Override
    protected Response echo(Request request) {
        return new Response();
    }
}
