package com.lea.pattern_5_buider.customize;

/**
 * @author lzc
 * @create 2020-11-11 11:19
 *
 */
public class Bike {

    // 自行车有这些零件
    private Frame frame;
    private Site site;
    private Tire tire;

    public Bike() {}
    public Bike(Frame frame, Site site, Tire tire) {
        this.frame = frame;
        this.site = site;
        this.tire = tire;
    }

    public Frame getFrame() {
        return frame;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }
}
