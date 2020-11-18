package com.lea.pattern_6_proxy.dynamicproxy;



import com.lea.pattern_6_proxy.ordinaryproxy.GamePlayer;
import com.lea.pattern_6_proxy.ordinaryproxy.IGamePlayer;

/**
 * @author lzc
 * @create 2020-11-12 13:45
 *
 * 动态代理：
 *  是在运行时才指定代理类哪个对象。相对来说，它在不改变代码的情况下，增强了或控制对象的行为
 *
 * JDK提供的动态代理有个限制，
 *      被代理类必须实现接口
 * CGLIB可以完全不需要接口也可以实现动态代理
 */
public class Client {

    public static void main(String[] args) {
        GamePlayer gamePlayer = new GamePlayer("李四");
//        GamePlayIH handler = new GamePlayIH(gamePlayer);
//        ClassLoader cl = gamePlayer.getClass().getClassLoader();
//        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, handler);
        // spring中的动态代理
//        IGamePlayer proxy = DynamicProxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, handler);
        IGamePlayer proxy = SubjectDynamicProxy.newProxyInstance(gamePlayer);
        proxy.login("username", "password");
        proxy.killBoss();
        proxy.upgrade();
    }
}
