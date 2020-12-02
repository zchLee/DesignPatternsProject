package com.lea.pattern_19_visitor.simple;

/**
 * @author lzc
 * @create 2020-11-27 09:52
 * 抽象员工
 */
public abstract class Employee {

    public final static int MALE = 0;  // 0代表男性
    public final static int FEMALE = 1;  // 1代表女性

    private String name;
    private int salary;
    private int sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public final void report() {
        String info = "姓名：" + this.name + "\n";
        info += "性别：" + (this.sex == MALE ? '男' : '女') + "\n";
        info += "工资：" + this.salary + "\n";
        System.out.println(info);
    }
    // 不同角色的不同信息
    protected abstract String getOtherInfo();
    // 允许一个访问者访问
    public abstract void accept(IVisitor visitor);

}
