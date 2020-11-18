package com.lea.pattern_9_chainofresponsibility.ancient;

/**
 * @author lzc
 * @create 2020-11-18 10:33
 */
public class Husband extends Handler {
    public Husband(int level) {
        super(level);
    }

    @Override
    protected void response(IWoman woman) {
        System.out.println("媳妇向丈夫请示");
        System.out.println(woman.getRequest());
        System.out.println("husband say: ok! just go!\n");
    }
}
