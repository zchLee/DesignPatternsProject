package com.lea.pattern_6_proxy.enforcementproxy;

/**
 * @author lzc
 * @create 2020-11-12 11:28
 * 强制代理类：
 *      比较特殊。必须通过真实角色查找代理角色，否则不能访问
 */
public class Client {

    public static void main(String[] args) {
        GamePlayer gamePlayer = new GamePlayer("小三");
        // 用自己调用不好使
        gamePlayer.login("san", "password");
        // 用代理对象也不好使
        GamePlayerProxy playerProxy = new GamePlayerProxy(gamePlayer);
        playerProxy.killBoss();
        System.out.println("用自己的代理对象");
        // 只能用自己的代理的对象 才能好使
        IGamePlayer proxy = gamePlayer.getProxy();
        proxy.login("san", "password");
        proxy.killBoss();
        proxy.upgrade();
    }
}
