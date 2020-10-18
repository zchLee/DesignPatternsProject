package com.lea.dependenceinversion;

/**
 * @author lzc
 * @create 2020-10-18 17:07
 */
public class Benz implements ICar {
    @Override
    public void run() {
        System.out.println("奔驰 突突突突的跑----");
    }
}
