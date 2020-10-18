package com.lea.dependenceinversion;

/**
 * @author lzc
 * @create 2020-10-18 17:06
 */
public class ZhangSan implements IDriver {
    private ICar car;

    public ZhangSan(){}

    // 构造方式传递依赖
    public ZhangSan(ICar car){
        this.car = car;
    }

    public void driver() {
        this.car.run();
    }

    // set方式注入
    @Override
    public void setCar(ICar car) {
        this.car = car;
    }

    // 接口式传递依赖
    @Override
    public void driver(ICar car) {
        System.out.println("张三开车");
        car.run();
    }
}
