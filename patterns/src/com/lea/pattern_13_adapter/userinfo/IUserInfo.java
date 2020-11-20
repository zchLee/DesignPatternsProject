package com.lea.pattern_13_adapter.userinfo;

/**
 * @author lzc
 * @create 2020-11-20 11:00
 * 员工信息接口
 */
public interface IUserInfo {
    // 获得用户名
    String getUserName();
    // 获得家庭地址
    String getHomeAddress();
    // 获取手机号码
    String getMobileNumber();
    // 办公室电话是多少
    String getOfficeTelNumber();
    // 职位是什么
    String getJobPosition();
    // 获得家庭电话，
    String getHomeTelNumber();
}
