package com.lea.pattern_6_proxy.ordinaryproxy;

/**
 * @author lzc
 * @create 2020-11-12 11:20
 */
public class GamePlayer implements IGamePlayer {

    private String name = "";

    public GamePlayer(String name) {
        this.name = name;
    }

    public GamePlayer(IGamePlayer gamePlayer, String name) {
        if (gamePlayer == null) {
            throw new RuntimeException("不能创建真实对象");
        }
        this.name = name;
    }

    @Override
    public void login(String username, String password) {
        System.out.println(this.name + "登陆成功！");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "在杀怪！");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + "升级了！");
    }
}
