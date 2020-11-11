package com.lea.pattern_5.buider;

import java.util.ArrayList;

/**
 * @author lzc
 * @create 2020-11-11 10:55
 *
 * 汽车抽象构造器
 */
public abstract class CarBuilder {

    public abstract void setSequence(ArrayList<String> sequence);

    public abstract CarModel getCarModel();
}
