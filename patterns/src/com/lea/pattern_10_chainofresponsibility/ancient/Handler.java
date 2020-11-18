package com.lea.pattern_10_chainofresponsibility.ancient;

/**
 * @author lzc
 * @create 2020-11-18 10:21
 */
public abstract class Handler {
    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBAND_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;
    // 能处理级别
    private int level = 0;
    // 下一级的处理责任人
    private Handler nextHandler;
    // 每个子类，都要说明自己的处理级别
    public Handler(int level) {
        this.level = level;
    }

    /*
    如果不属于你处理的请求，应该找下一个环节的处理人
     */
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
//        return this;
    }

    // 抽象回应, 由子类实现
    protected abstract void response(IWoman woman);

    // 处理请求，如果不是自己的初级界别就让下个级别来处理
    public final void HandleMessage(IWoman woman) {
        if (woman.getType() == this.level) {
            this.response(woman);
        }else {
            if (this.nextHandler != null) {
                this.nextHandler.nextHandler.HandleMessage(woman);
            }else {
                System.out.println("没有后续处理人，按不同意处理");
            }
        }
    }
}
