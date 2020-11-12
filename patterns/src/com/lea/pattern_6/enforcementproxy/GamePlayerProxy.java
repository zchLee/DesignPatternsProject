package com.lea.pattern_6.enforcementproxy;

/**
 * @author lzc
 * @create 2020-11-12 11:31
 */
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;

    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void login(String username, String password) {
        this.gamePlayer.login(username, password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }

    // 代理的代理没有，暂时是自己
    @Override
    public IGamePlayer getProxy() {
        return this;
    }
}
