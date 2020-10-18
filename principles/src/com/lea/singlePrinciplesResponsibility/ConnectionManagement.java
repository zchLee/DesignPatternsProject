package com.lea.singlePrinciplesResponsibility;

/**
 * @author lzc
 * @create 2020-10-18 11:25
 */
public interface ConnectionManagement {

    // 拨号
    void dial(String phoneNumber);

    // 结束通话
    void hangup();
}
