package com.lea.pattern_13_adapter.expand;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lzc
 * @create 2020-11-20 14:03
 */
public class OuterUserBaseInfo implements IOuterUserBaseInfo {
    @Override
    public Map<String, String> getUserBaseInfo() {
        HashMap<String, String> map = new HashMap<>();
        map.put("userName", "这个员工叫大哥大");
        map.put("mobileNumber", "这个员工电话是...");
        return map;
    }
}
