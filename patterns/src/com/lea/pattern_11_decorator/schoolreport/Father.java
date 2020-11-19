package com.lea.pattern_11_decorator.schoolreport;

/**
 * @author lzc
 * @create 2020-11-19 10:12
 */
public class Father {

    public static void main(String[] args) {
        SchoolReport sc = new FourSchoolReport();
        sc = new HighScoreDecorator(sc);
        sc = new SortDecorator(sc);
        sc.report();
        sc.sign("f");
    }
}
