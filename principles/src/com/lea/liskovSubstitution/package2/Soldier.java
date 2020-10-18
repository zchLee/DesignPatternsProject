package com.lea.liskovSubstitution.package2;

import com.lea.liskovSubstitution.package1.AbstractGun;

/**
 * @author lzc
 * @create 2020-10-18 14:38
 */
public class Soldier {


    private AUG aug;


    // 给士兵分配枪
    public void setGun(AUG aug) {
        this.aug = aug;
    }

    public void killEnemy() {
        aug.zoomOut();
        aug.shoot();
    }
}
