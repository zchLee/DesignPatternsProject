package com.lea.pattern_6.ordinaryproxy;

/**
 * @author lzc
 * @create 2020-11-12 11:19
 */
public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer iGamePlayer;

    public GamePlayerProxy(String name) {
        this.iGamePlayer = new GamePlayer(this, name);
    }
    @Override
    public void login(String username, String password) {
        this.iGamePlayer.login(username, password);
    }

    @Override
    public void killBoss() {
        this.iGamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.iGamePlayer.upgrade();
    }
}
