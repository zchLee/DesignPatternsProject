package com.lea.pattern_11_decorator.schoolreport;

/**
 * @author lzc
 * @create 2020-11-19 10:06
 */
public abstract class Decorator extends SchoolReport {
    SchoolReport schoolReport;

    public Decorator(SchoolReport schoolReport) {
        this.schoolReport = schoolReport;
    }

    @Override
    public void report() {
        this.schoolReport.report();
    }

    @Override
    public void sign(String name) {
        this.schoolReport.sign(name);
    }
}
