package com.lea.interfaceIsolation;

/**
 * @author lzc
 * @create 2020-10-27 10:55
 */
public class Searcher extends AbstractSearcher {

    public Searcher(IPettyGirl pettyGirl) {
        super(pettyGirl);
    }

    @Override
    public void show() {
        System.out.println("美女信息如下");
        super.pettyGirl.goodLooking();
        super.pettyGirl.greatTemperament();
        super.pettyGirl.niceFigure();
    }
}
