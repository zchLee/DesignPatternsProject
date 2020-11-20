package com.lea.pattern_13_adapter.expand;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lzc
 * @create 2020-11-20 14:04
 */
public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {
    @Override
    public Map<String, String> getUserOfficeInfo() {
        HashMap<String, String> map = new HashMap<>();
        map.put("jobPosition", "这个人的职位是BOSS");
        map.put("officeTelNumber", "员工的办公电话。。");
        return map;
    }
}
