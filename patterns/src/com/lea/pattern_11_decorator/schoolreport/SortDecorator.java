package com.lea.pattern_11_decorator.schoolreport;

/**
 * @author lzc
 * @create 2020-11-19 10:11
 */
public class SortDecorator extends Decorator {
    public SortDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    // 修饰方法
    private void reportSort() {
        System.out.println("我是排名第38名...");
    }


    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
