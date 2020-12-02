package com.lea.pattern_19_visitor.simple;

/**
 * @author lzc
 * @create 2020-11-27 09:57
 * 管理者
 */
public class Manager extends Employee {
    // 管理者的业绩
    private String performance;

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    protected String getOtherInfo() {
        return this.performance;
    }
}
