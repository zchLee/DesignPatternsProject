package com.lea.pattern_13_adapter.userinfo;

import java.util.Map;

/**
 * @author lzc
 * @create 2020-11-20 11:07
 * 外部接入的人员信息接口
 */
public interface IOuterUser {
    // 用户基本的信息
    Map<String, String> getUserBaseInfo();

    // 工作区域信息
    Map<String, String> getUserOfficeInfo();

    // 用户家庭信息
    Map<String, String> getUserHomeInfo();
}
