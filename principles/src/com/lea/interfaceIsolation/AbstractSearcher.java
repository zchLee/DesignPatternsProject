package com.lea.interfaceIsolation;

/**
 * @author lzc
 * @create 2020-10-27 10:53
 */
public abstract class AbstractSearcher {
    protected IPettyGirl pettyGirl;
    public AbstractSearcher(IPettyGirl pettyGirl) {
        this.pettyGirl = pettyGirl;
    }

    public abstract void show();
}
