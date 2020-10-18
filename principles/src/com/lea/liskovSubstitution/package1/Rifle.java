package com.lea.liskovSubstitution.package1;

/**
 * @author lzc
 * @create 2020-10-18 14:33
 */
public class Rifle extends AbstractGun {

    // 射程远，威力大
    @Override
    public void shoot() {
        System.out.println("步枪射击");
    }
}
