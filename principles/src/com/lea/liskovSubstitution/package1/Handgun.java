package com.lea.liskovSubstitution.package1;

/**
 * @author lzc
 * @create 2020-10-18 14:32
 */
public class Handgun extends AbstractGun {
    // 射程短，威力小，但不重便于携带
    @Override
    public void shoot() {
        System.out.println("手枪射击");
    }
}
