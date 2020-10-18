package com.lea.liskovSubstitution.package1;

/**
 * @author lzc
 * @create 2020-10-18 14:33
 */
public class MachineGun extends AbstractGun {
    // 连续扫射
    @Override
    public void shoot() {
        System.out.println("机枪射击");
    }
}
