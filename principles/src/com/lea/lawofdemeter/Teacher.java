package com.lea.lawofdemeter;

import java.util.ArrayList;

/**
 * @author lzc
 * @create 2020-11-3 09:44
 *
 * 首先说下什么是 朋友类：
 *  出现在成员变量，方法的输入输出参数中的参数称为成员朋友类，而方法体内部的类 不属于朋友类
 *  迪米特法则 说 类只和直接朋友类交流，此处老师类和Girl类接触，破坏了类的健壮性
 *  方法是一个类的行为，类竟然不知道自己的行为与其他类产生依赖关系，这是不允许的，违反了迪米特法则
 */
public class Teacher {

    // 清一下女生的人数
    public void command(GroupLeader groupLeader) {
        // 违反了迪米特法则
//        ArrayList<Girl> girls = new ArrayList<>();
//        Girl girl = null;
//        for (int i = 0; i < 20; i++) {
//            girl = new Girl();
//            girls.add(girl);
//        }
//        groupLeader.countGirls(girls);

        groupLeader.countGirls();
    }
}
