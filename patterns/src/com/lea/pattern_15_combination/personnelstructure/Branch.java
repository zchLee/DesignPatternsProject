package com.lea.pattern_15_combination.personnelstructure;

import java.util.ArrayList;

/**
 * @author lzc
 * @create 2020-11-23 11:13
 */
public class Branch implements IBranch {

    private ArrayList subordinationList = new ArrayList();
    // 树枝节点的名称
    private String name = "";
    // 树枝节点职位
    private String position = "";
    // 树枝节点的薪水
    private int salary = 0;

    public Branch(String name, String position, int salary) {
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

    @Override
    public void add(IBranch branch) {
        this.subordinationList.add(branch);
    }

    @Override
    public void add(ILeaf leaf) {
        this.subordinationList.add(leaf);
    }

    @Override
    public ArrayList getSubordinationInfo() {
        return  this.subordinationList;
    }
}
