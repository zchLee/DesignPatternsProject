package com.lea.pattern_13_adapter.userinfo;

/**
 * @author lzc
 * @create 2020-11-20 11:03
 */
public class UserInfo implements IUserInfo {
    @Override
    public String getUserName() {
        return "员工姓名 某某某";
    }

    @Override
    public String getHomeAddress() {
        return "家庭住址 某某区";
    }

    @Override
    public String getMobileNumber() {
        return "手机号 0000";
    }

    @Override
    public String getOfficeTelNumber() {
        return "办公室电话 666";
    }

    @Override
    public String getJobPosition() {
        return "职位是大boss";
    }

    @Override
    public String getHomeTelNumber() {
        return "家庭电话 123";
    }
}
