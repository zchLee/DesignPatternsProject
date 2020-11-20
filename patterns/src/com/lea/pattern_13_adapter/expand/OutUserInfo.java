package com.lea.pattern_13_adapter.expand;

import com.lea.pattern_13_adapter.userinfo.IUserInfo;

import java.util.Map;

/**
 * @author lzc
 * @create 2020-11-20 14:05
 */
public class OutUserInfo implements IUserInfo {
    // 源角色是多个时，可以使用类关联
    private IOuterUserBaseInfo userBaseInfo;
    private IOuterUserOfficeInfo userOfficeInfo;
    private IOuterUserHomeInfo userHomeInfo;

    // 数据处理
    private Map<String, String> baseInfo = null;  // 员工基本信息
    private Map<String, String> officeInfo = null;  // 员工办公信息
    private Map<String, String> homeInfo = null;

    // 使用构造器关联类
    public OutUserInfo(IOuterUserBaseInfo userBaseInfo, IOuterUserOfficeInfo userOfficeInfo, IOuterUserHomeInfo userHomeInfo) {
        this.userBaseInfo = userBaseInfo;
        this.userOfficeInfo = userOfficeInfo;
        this.userHomeInfo = userHomeInfo;
        // 关联数据
        this.baseInfo = userBaseInfo.getUserBaseInfo();
        this.officeInfo = userOfficeInfo.getUserOfficeInfo();
        this.homeInfo = userHomeInfo.getUserHomeInfo();
    }

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
