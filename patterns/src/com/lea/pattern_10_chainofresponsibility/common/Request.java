package com.lea.pattern_10_chainofresponsibility.common;

/**
 * @author lzc
 * @create 2020-11-18 10:57
 * 请求事件
 */
public class Request {
    public Request(Level level) {
        this.level = level;
    }

    private Level level;
    // 放回请求级别
    public Level getLevel() {
        return this.level;
    }

}
