package com.lea.pattern_20_status.test;

/**
 * @author lzc
 * @create 2020-12-3 14:36
 * 根据电梯的状态，做出不同的操作，有些操作是不可以操作的。
 * 根据这个思路
 *  1.电梯在具有这些状态的时候能够做什么事情，也就是说电梯处于某个具体状态时，我们来思考
 *  这个状态是由什么动作触发而产生的，以及在这个状态下电梯还能做什么
 *  思考两个问题：
 *      1. 状态时怎么来的？
 *      2.在当前状态电梯能做什么
 */
public class LiftClient {

    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(Context.closingState);
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
