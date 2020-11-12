package com.lea.pattern_6.dynamicproxy;

import com.lea.pattern_6.ordinaryproxy.IGamePlayer;

/**
 * @author lzc
 * @create 2020-11-12 14:14
 */
public class SubjectDynamicProxy extends DynamicProxy {

    public static <T> T newProxyInstance(IGamePlayer player) {
        ClassLoader loader = player.getClass().getClassLoader();
        Class<?>[] interfaces = player.getClass().getInterfaces();
        GamePlayIH handler = new GamePlayIH(player);
        return newProxyInstance(loader, interfaces, handler);
    }

}
