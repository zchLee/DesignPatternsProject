package com.lea.pattern_13_adapter.expand;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lzc
 * @create 2020-11-20 14:03
 */
public class OuterUserHomeInfo implements IOuterUserHomeInfo {
    @Override
    public Map<String, String> getUserHomeInfo() {
        HashMap<String, String> map = new HashMap<>();
        map.put("homeNumber", "家庭电话是。。");
        map.put("homeAddress", "家庭住址在...");
        return map;
    }
}
