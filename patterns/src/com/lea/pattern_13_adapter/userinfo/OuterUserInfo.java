package com.lea.pattern_13_adapter.userinfo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lzc
 * @create 2020-11-20 11:15
 */
public class OuterUserInfo extends OuterUser implements IUserInfo {
    private Map<String, String> baseInfo = super.getUserBaseInfo();  // 员工基本信息
    private Map<String, String> officeInfo = super.getUserOfficeInfo();  // 员工办公信息
    private Map<String, String> homeInfo = super.getUserHomeInfo();  // 员工家庭信息

    @Override
    public String getUserName() {
        return baseInfo.get("userName");
    }

    @Override
    public String getHomeAddress() {
        return homeInfo.get("homeAddress");
    }

    @Override
    public String getMobileNumber() {
        return baseInfo.get("mobileNumber");
    }

    @Override
    public String getOfficeTelNumber() {
        return officeInfo.get("officeTelNumber");
    }

    @Override
    public String getJobPosition() {
        return officeInfo.get("jobPosition");
    }

    @Override
    public String getHomeTelNumber() {
        return homeInfo.get("homeNumber");
    }


}
