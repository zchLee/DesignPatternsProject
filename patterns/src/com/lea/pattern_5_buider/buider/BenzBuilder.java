package com.lea.pattern_5_buider.buider;

import java.util.ArrayList;

/**
 * @author lzc
 * @create 2020-11-11 10:58
 */
public class BenzBuilder extends CarBuilder {

    private BenzModel benz = new BenzModel();


    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}
