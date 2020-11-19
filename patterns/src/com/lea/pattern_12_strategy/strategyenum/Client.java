package com.lea.pattern_12_strategy.strategyenum;

/**
 * @author lzc
 * @create 2020-11-19 14:15
 */
public class Client {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        String sign = args[1];
        int b = Integer.parseInt(args[2]);

        int exec = StrategyEnum.getEnum(sign).exec(a, b);
        System.out.println(exec);
    }
}
