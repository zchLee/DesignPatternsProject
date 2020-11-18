package com.lea.pattern_9_chainofresponsibility.ancient;

/**
 * @author lzc
 * @create 2020-11-18 10:33
 */
public class Son extends Handler {
    public Son(int level) {
        super(level);
    }

    @Override
    protected void response(IWoman woman) {
        System.out.println("母亲向儿子请示");
        System.out.println(woman.getRequest());
        System.out.println("son say: mom, do what you do! don't worry!\n");
    }
}
