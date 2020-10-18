package com.lea.liskovSubstitution.package2;

import com.lea.liskovSubstitution.package1.Rifle;

/**
 * @author lzc
 * @create 2020-10-18 15:01
 */
public class AUG extends Rifle {

    public void zoomOut() {
        System.out.println("通过望远镜察看敌人");
    }

    @Override
    public void shoot() {
        System.out.println("AUG阻击枪 发射子弹...");
    }
}
