package com.lea.liskovSubstitution.package2;

import com.lea.liskovSubstitution.package1.Rifle;

/**
 * @author lzc
 * @create 2020-10-18 15:00
 *
 * 子类可以有自己的个性，在里士替换中，父类存在的地方，子类一定可以存在，反之就不怎么使用了
 *
 */
public class Client {

    public static void main(String[] args) {
        // 阻击手杀敌
        Soldier soldier = new Soldier();
        soldier.setGun(new AUG());
        soldier.killEnemy();

        // 这行代码就运行不了，因为子类转换不了成为一个父类  java.lang.ClassCastException:
        Soldier soldier2 = new Soldier();
        soldier.setGun((AUG) (new Rifle()));
        soldier.killEnemy();
    }
}
