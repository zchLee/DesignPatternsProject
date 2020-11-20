package com.lea.pattern_13_adapter.userinfo;

import com.sun.jmx.snmp.internal.SnmpOutgoingRequest;

/**
 * @author lzc
 * @create 2020-11-20 11:21
 */
public class Client {

    public static void main(String[] args) {
        // 通过OuterUserInfo 将 OutUserInfo 转换成 UserInfo
        IUserInfo outInfo = new OuterUserInfo();
        IUserInfo info = new UserInfo();

        System.out.println("outUser的信息" + outInfo.getHomeAddress());
        System.out.println("userInfo的信息" + info.getHomeAddress());
    }
}
