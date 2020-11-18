package com.lea.pattern_8_mediator.common;


/**
 * @author lzc
 * @create 2020-11-16 11:31
 */
public abstract class Colleague {
    protected Mediator mediator;
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
