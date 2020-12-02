package com.lea.pattern_19_visitor.simple;

/**
 * @author lzc
 * @create 2020-11-27 09:56
 * 普通员工
 */
public class CommonEmployee extends Employee {
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    protected String getOtherInfo() {
        return this.job;
    }
}
