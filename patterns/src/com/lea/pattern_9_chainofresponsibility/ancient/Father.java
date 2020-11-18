package com.lea.pattern_9_chainofresponsibility.ancient;

/**
 * @author lzc
 * @create 2020-11-18 10:31
 */
public class Father extends Handler {
    public Father(int level) {
        super(level);
    }

    @Override
    protected void response(IWoman woman) {
        System.out.println("女儿向父亲请示");
        System.out.println(woman.getRequest());
        System.out.println("father say: ok! just go!\n");
    }
}
