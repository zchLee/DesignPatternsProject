package com.lea.pattern_6_proxy.ordinaryproxy;

/**
 * @author lzc
 * @create 2020-11-12 11:24
 */
public class Client {

    public static void main(String[] args) {
        IGamePlayer proxy = new GamePlayerProxy("张三");
        System.out.println("开始时间是：2020-11-12 11:25");
        proxy.login("zhangsan", "password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("开始时间是：2020-11-12 23:25");
    }
}
