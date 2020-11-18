package com.lea.pattern_9_chainofresponsibility.common;

/**
 * @author lzc
 * @create 2020-11-18 10:59
 */
public abstract class Handler {

    private Handler nextHandler;

    public final Response handlerMessage(Request request) {
        Response response = null;
        if (this.getHandlerLevel().equals(request.getLevel())) {
            this.echo(request);
        } else {
            if (nextHandler != null) {
               response = this.nextHandler.handlerMessage(request); // 传递到下个节点处理
            } else {
                // 没有适当的处理者，业务自行处理
            }
        }
        return response;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // 每个处理节点都有一个等级
    protected abstract Level getHandlerLevel();

    // 每个节点自己定义的处理逻辑
    protected abstract Response echo(Request request);
}
