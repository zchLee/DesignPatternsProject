package com.lea.lawofdemeter;

import java.util.List;

/**
 * @author lzc
 * @create 2020-11-3 09:44
 */
public class GroupLeader {
//    违反了迪米特法则
//    public void countGirls(List<Girl> girls) {
//        System.out.println("女生的人数：" + girls.size());
//    }

    private List<Girl> girls;

    public GroupLeader(List<Girl> girls) {
        this.girls = girls;
    }

    public void countGirls() {
        System.out.println("女生的人数：" +  this.girls.size());
    }
}
