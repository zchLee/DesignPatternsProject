package com.lea.pattern_2.multifactory;

/**
 * @author lzc
 * @create 2020-11-6 15:05
 * // 女娲烧人 火候刚刚好，黄种人就出来了
 */
public class YellowHuman extends Human {
    @Override
    public void getColor() {
        System.out.println("不黑也不白的黄皮肤");
    }

    @Override
    public void talk() {
        System.out.println("说方块字");
    }
}
