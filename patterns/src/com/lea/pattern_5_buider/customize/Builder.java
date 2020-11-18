package com.lea.pattern_5_buider.customize;

/**
 * @author lzc
 * @create 2020-11-11 11:36
 */
public abstract class Builder {

//    public abstract void builderFrame();
//    public abstract void builderSite();
//    public abstract void builderTire();

    abstract void builderFrame();
    abstract void builderSite();
    abstract void builderTire();

    public abstract Bike createBike();
}
