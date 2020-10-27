package com.lea.interfaceIsolation;

/**
 * @author lzc
 * @create 2020-10-27 11:00
 */
public class Client {

    public static void main(String[] args) {
        IPettyGirl girl = new PettyGirl("小花");
        // 星探
        Searcher star = new Searcher(girl);
        star.show();
    }
}
