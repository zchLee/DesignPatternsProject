package com.lea.lawofdemeter.eg2;

import java.util.Random;

/**
 * @author lzc
 * @create 2020-11-3 10:00
 */
public class Wizard {
    private Random rand = new Random(System.currentTimeMillis());

    private int first() {
        System.out.println("执行第一步方法");
        return rand.nextInt();
    }

    private int second() {
        System.out.println("执行第二步方法");
        return rand.nextInt();
    }

    private int third() {
        System.out.println("执行第三部方法");
        return rand.nextInt();
    }

    public void installWizard() {
        int first = first();
        if (first > 50) {
            int second = second();
            if (second > 50) {
                int third = third();
            }
        }
    }
}
