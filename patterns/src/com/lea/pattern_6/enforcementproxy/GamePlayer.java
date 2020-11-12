package com.lea.pattern_6.enforcementproxy;

/**
 * @author lzc
 * @create 2020-11-12 11:31
 */
public class GamePlayer implements IGamePlayer {
    // who am i?
    private String name = "";

    // 个人代理
    private IGamePlayer myProxy = null;

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String username, String password) {
        if (!isProxy())
            System.out.println("请使用指定代理");
        else
            System.out.println(this.name + "登陆成功");
    }

    @Override
    public void killBoss() {
        if (!isProxy())
            System.out.println("请使用指定代理");
        else
            System.out.println(this.name + "击杀boss");
    }

    @Override
    public void upgrade() {
        if (!isProxy())
            System.out.println("请使用指定代理");
        else
            System.out.println(this.name + "升级了");
    }

    @Override
    public IGamePlayer getProxy() {
        this.myProxy = new GamePlayerProxy(this);
        return this.myProxy;
    }

    // 判断是否有自己的代理
    private boolean isProxy() {
        if (myProxy == null)
            return false;
        return true;
    }
}
