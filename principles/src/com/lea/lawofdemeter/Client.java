package com.lea.lawofdemeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lzc
 * @create 2020-11-3 09:54
 */
public class Client {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        List<Girl> girls = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            girls.add(new Girl());
        }
        GroupLeader groupLeader = new GroupLeader(girls);
        teacher.command(groupLeader);
    }
}
