package com.lea.pattern_9_chainofresponsibility.ancient;

import java.util.Random;

/**
 * @author lzc
 * @create 2020-11-18 10:34
 * 古代陋习：
 *  女子三从四德的演示
 */
public class Client {

    public static void main(String[] args) {
        Father father = new Father(1);
        Husband husband = new Husband(2);
        Son son = new Son(3);
        // 调整顺序
        father.setNextHandler(husband);
        husband.setNextHandler(son);

        // 随机挑选几个女性
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            Woman woman = new Woman(random.nextInt(4), "我要恰烧烤");
            // 发起请求
            father.HandleMessage(woman);
        }


    }
}
