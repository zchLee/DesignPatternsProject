package com.lea.pattern_13_adapter.userinfo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lzc
 * @create 2020-11-20 11:10
 */
public class OuterUser implements IOuterUser {
    @Override
    public Map<String, String> getUserBaseInfo() {
        HashMap<String, String> map = new HashMap<>();
        map.put("userName", "这个员工叫大哥大");
        map.put("mobileNumber", "这个员工电话是...");
        return map;
    }

    @Override
    public Map<String, String> getUserOfficeInfo() {
        HashMap<String, String> map = new HashMap<>();
        map.put("jobPosition", "这个人的职位是BOSS");
        map.put("officeTelNumber", "员工的办公电话。。");
        return map;
    }

    @Override
    public Map<String, String> getUserHomeInfo() {
        HashMap<String, String> map = new HashMap<>();
        map.put("homeNumber", "家庭电话是。。");
        map.put("homeAddress", "家庭住址在...");
        return map;
    }
}
