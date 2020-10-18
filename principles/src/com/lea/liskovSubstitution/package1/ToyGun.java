package com.lea.liskovSubstitution.package1;

/**
 * @author lzc
 * @create 2020-10-18 14:48
 *
 * 注意：
 *  如果子类不能实现父类的方法，或者父类的某些方法在子类中已经发生“畸变”，
 *      则建议断开父子继承关系，采用依赖、聚集、组合等关系代替继承
 */
public class ToyGun extends AbstractToy {
    @Override
    void shoot() {
        System.out.println("杀不了人，放点音乐轻松一下吧");
    }
}
