package com.lea.pattern_7_prototype.sendEmail;

/**
 * @author lzc
 * @create 2020-11-13 10:05
 * 广告信模板
 */
public class AdvTemplate {

    private String advSubject = "XX银行国庆信用卡抽奖活动";
    private String advContext = "国庆抽奖活动，只要刷卡就送你一百万";

    // 取得广告信名称
    public String getAdvSubject() {
        return advSubject;
    }
    // 取得广告信内容
    public String getAdvContext() {
        return advContext;
    }
}
