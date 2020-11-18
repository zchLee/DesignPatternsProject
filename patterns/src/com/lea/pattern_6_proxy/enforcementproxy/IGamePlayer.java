package com.lea.pattern_6_proxy.enforcementproxy;

/**
 * @author lzc
 * @create 2020-11-12 11:30
 */
public interface IGamePlayer {

    void login(String username, String password);

    void killBoss();

    void upgrade();

    // 找到自己的代理对象
    IGamePlayer getProxy();
}
