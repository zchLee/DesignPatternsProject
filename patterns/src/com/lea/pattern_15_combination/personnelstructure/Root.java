package com.lea.pattern_15_combination.personnelstructure;

import java.util.ArrayList;

/**
 * @author lzc
 * @create 2020-11-23 11:04
 */
public class Root implements IRoot {
    private ArrayList subordinationList = new ArrayList();
    // 根节点的名称
    private String name = "";
    // 根节点的职位
    private String position = "";
    // 薪水
    private int salary = 0;

    public Root(String name, String position, int salary) {
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
        return this.subordinationList;
    }
}
