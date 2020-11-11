package com.lea.pattern_5.buider;

import java.util.ArrayList;

/**
 * @author lzc
 * @create 2020-11-11 11:08
 * 指挥类：指挥奔驰车各种开启方式
 */
public class Director {
    BenzBuilder benzBuilder = new BenzBuilder();
    ArrayList<String> sequence = new ArrayList<>();

    public BenzModel getABenzModel() {
        this.sequence.clear();
        sequence.add("alarm");
        sequence.add("engineBoom");
        sequence.add("start");
        sequence.add("stop");
        benzBuilder.setSequence(sequence);
        CarModel benz = benzBuilder.getCarModel();
        return (BenzModel) benz;
    };

    public BenzModel getBBenzModel() {
        this.sequence.clear();
        sequence.add("start");
        sequence.add("engineBoom");
        sequence.add("stop");
        benzBuilder.setSequence(sequence);
        CarModel benz = benzBuilder.getCarModel();
        return (BenzModel) benz;
    };

    public BenzModel getCBenzModel() {
        this.sequence.clear();
        sequence.add("start");
        sequence.add("stop");
        benzBuilder.setSequence(sequence);
        CarModel benz = benzBuilder.getCarModel();
        return (BenzModel) benz;
    };

    public BenzModel getDBenzModel() {
        this.sequence.clear();
        sequence.add("start");
        benzBuilder.setSequence(sequence);
        CarModel benz = benzBuilder.getCarModel();
        return (BenzModel) benz;
    };
}
