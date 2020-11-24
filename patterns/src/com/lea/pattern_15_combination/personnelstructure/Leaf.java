package com.lea.pattern_15_combination.personnelstructure;

/**
 * @author lzc
 * @create 2020-11-23 11:17
 */
public class Leaf implements ILeaf {
    // 树枝节点的名称
    private String name = "";
    // 树枝节点职位
    private String position = "";
    // 树枝节点的薪水
    private int salary = 0;

    public Leaf(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        String info = "";
        info = "名称" + this.name;
        info += "\t职位：" + this.position;
        info += "\t薪水：" + this.salary;
        return info;
    }

}
