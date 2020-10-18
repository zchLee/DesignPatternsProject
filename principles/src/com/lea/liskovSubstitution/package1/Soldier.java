package com.lea.liskovSubstitution.package1;

/**
 * @author lzc
 * @create 2020-10-18 14:38
 */
public class Soldier {

    private String code;

    private AbstractGun gun;

    public Soldier(String code) {
        this.code = code;
    }

    // 给士兵分配枪
    public void setGun(AbstractGun gun) {
        this.gun = gun;
    }

    public void killEnemy() {
        System.out.println(this.code + "开始杀敌.....");
        gun.shoot();
    }
}
