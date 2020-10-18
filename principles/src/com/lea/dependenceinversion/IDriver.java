package com.lea.dependenceinversion;

/**
 * @author lzc
 * @create 2020-10-18 17:04
 *
 * 定义汽车抽象类，具体实现由实现类去实现
 */
public interface IDriver {

    // 设置汽车型号
    void setCar(ICar car);

    // 开车
    void driver(ICar car);
}
