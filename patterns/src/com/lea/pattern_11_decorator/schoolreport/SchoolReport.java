package com.lea.pattern_11_decorator.schoolreport;

/**
 * @author lzc
 * @create 2020-11-19 10:02
 */
public abstract class SchoolReport {
    // 成绩单主要展示的就是你的成绩情况
    public abstract void report();
    // 成绩单要家长签字，挺要命的
    public abstract void sign(String name);
}
