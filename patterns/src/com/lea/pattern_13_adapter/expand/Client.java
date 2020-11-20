package com.lea.pattern_13_adapter.expand;

/**
 * @author lzc
 * @create 2020-11-20 14:09
 */
public class Client {

    public static void main(String[] args) {
        // 外部系统人员信息
        IOuterUserHomeInfo homeInfo = new OuterUserHomeInfo();
        IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo();
        IOuterUserBaseInfo baseInfo = new OuterUserBaseInfo();
        // 传入适配器关联对象
        OutUserInfo outUserInfo = new OutUserInfo(baseInfo, officeInfo, homeInfo);
        System.out.println(outUserInfo.getHomeAddress());
    }
}
