package com.lea.pattern_15_combination.personnelstructure;

import sun.security.util.Length;

import java.util.ArrayList;

/**
 * @author lzc
 * @create 2020-11-23 11:18
 */
public class Client {

    public static void main(String[] args) {
        // 产生一个根节点 老板
        IRoot ceo = new Root("王大麻子", "总经理", 10000);
        // 产生三个部门经理
        IBranch developDep = new Branch("刘大瘸子子", "研发部门经理", 10000);
        IBranch salesDep = new Branch("马二拐子", "销售部门经理", 20000);
        IBranch financeDep = new Branch("赵三驼子", "财务部门经理", 30000);
        // 产生三个小组长
        IBranch firstDevGroup = new Branch("杨三乜斜", "开发一组组长", 5000);
        IBranch secondDevGroup = new Branch("吴大棒槌", "开发二组组长", 6000);
        // 剩下的就是俺们小兵
        ILeaf a = new Leaf("a", "开发人员", 2000);
        ILeaf b = new Leaf("b", "开发人员", 2000);
        ILeaf c = new Leaf("c", "开发人员", 2000);
        ILeaf d = new Leaf("d", "开发人员", 2000);
        ILeaf e = new Leaf("e", "开发人员", 2000);
        ILeaf f = new Leaf("f", "开发人员", 2000);
        ILeaf g = new Leaf("g", "开发人员", 2000);

        ILeaf h = new Leaf("h", "销售人员", 5000);
        ILeaf i = new Leaf("i", "销售人员", 4000);

        ILeaf j = new Leaf("j", "财务人员", 5000);
        ILeaf k = new Leaf("k", "CEO秘书", 8000);
        ILeaf xiaoLiu = new Leaf("小六", "研发副总", 20000);
        // 组装这个树形结构
        ceo.add(developDep);
        ceo.add(salesDep);
        ceo.add(financeDep);
        // ceo 还有个秘书
        ceo.add(k);

        // 定义研发部下的结构
        developDep.add(firstDevGroup);
        developDep.add(secondDevGroup);
        // 研发副总
        developDep.add(xiaoLiu);

        // 两个开发小组下还有什么
        firstDevGroup.add(a);
        firstDevGroup.add(b);
        firstDevGroup.add(c);
        secondDevGroup.add(e);
        secondDevGroup.add(f);
        secondDevGroup.add(g);

        // 销售部的人员情况
        salesDep.add(h);
        salesDep.add(i);

        financeDep.add(j);
        // ceo信息
        System.out.println(ceo.getInfo());
        // 打印整个树
        getAllSubordination(ceo.getSubordinationInfo());

    }

    private static void getAllSubordination(ArrayList subordination) {
        int length = subordination.size();
        for (int i = 0; i < length; i++) {
            Object s = subordination.get(i);
            if (s instanceof Leaf) { // 是叶子节点, 员工
                ILeaf leaf = (ILeaf) s;
                System.out.println(leaf.getInfo());
            } else {
                IBranch b = (IBranch) s;
                System.out.println(b.getInfo());
                getAllSubordination(b.getSubordinationInfo());
            }

        }
    }
}
