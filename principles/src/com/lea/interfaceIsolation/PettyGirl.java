package com.lea.interfaceIsolation;

/**
 * @author lzc
 * @create 2020-10-27 10:50
 */
public class PettyGirl implements IPettyGirl {
    private String name;

    public PettyGirl() {}

    public PettyGirl(String name) {
        this.name = name;
    }

    @Override
    public void goodLooking() {
        System.out.println(name + "，长得很好看");
    }

    @Override
    public void niceFigure() {
        System.out.println(name + "，身材也很好");
    }

    @Override
    public void greatTemperament() {
        System.out.println(name + "，气质很好");
    }
}
