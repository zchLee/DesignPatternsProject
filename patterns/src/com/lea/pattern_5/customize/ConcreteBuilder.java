package com.lea.pattern_5.customize;

/**
 * @author lzc
 * @create 2020-11-11 11:37
 */
public class ConcreteBuilder extends Builder {
    private Bike bike = new Bike();
//    @Override
//    public void builderFrame() {
//        bike.setFrame(new Frame());
//    }
//
//    @Override
//    public void builderSite() {
//        bike.setSite(new Site());
//    }
//
//    @Override
//    public void builderTire() {
//        bike.setTire(new Tire());
//    }

//    @Override
//    public Bike createBike() {
//        return this.bike;
//    }

    @Override
    void builderFrame() {
        bike.setFrame(new Frame());
    }

    @Override
    void builderSite() {
        bike.setSite(new Site());
    }

    @Override
    void builderTire() {
        bike.setTire(new Tire());
    }

    @Override
    public Bike createBike() {
        this.builderFrame();
        this.builderSite();
        this.builderTire();
        return this.bike;
    }
}
