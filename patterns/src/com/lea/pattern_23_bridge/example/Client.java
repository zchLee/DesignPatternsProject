package com.lea.pattern_23_bridge.example;

/**
 * @author lzc
 * @create 2020-12-6 21:45
 */
public class Client {

    public static void main(String[] args) {
        House house = new House();
        HouseCorp houseCorp = new HouseCorp(house);
        houseCorp.makeMoney();

        System.out.println("什么都能山寨的山寨公司");
        ShanzhaiCorp shanzhaiCorp = new ShanzhaiCorp(new IPad());
        shanzhaiCorp.makeMoney();
        System.out.println("不做ipad了 山寨公司要做服装");
        shanzhaiCorp = new ShanzhaiCorp(new Cloths());
        shanzhaiCorp.makeMoney();
    }
}
