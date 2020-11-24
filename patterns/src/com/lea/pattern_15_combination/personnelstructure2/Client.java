package com.lea.pattern_15_combination.personnelstructure2;


import com.lea.pattern_15_combination.personnelstructure.IBranch;

import java.util.ArrayList;

/**
 * @author lzc
 * @create 2020-11-23 14:35
 *
 * 优化人事结构的代码
 */
public class Client {

    public static void main(String[] args) {
        // 封装一个组织结构出来
        Branch ceo = compositeCorpTree();
        System.out.println(ceo.getInfo());
        getTreeInfo(ceo.getSubordinationInfo());
    }

    public static Branch compositeCorpTree() {
        // 产生一个根节点 老板
        Branch ceo = new Branch("王大麻子", "总经理", 10000);
        // 产生三个部门经理
        Branch developDep = new Branch("刘大瘸子子", "研发部门经理", 10000);
        Branch salesDep = new Branch("马二拐子", "销售部门经理", 20000);
        Branch financeDep = new Branch("赵三驼子", "财务部门经理", 30000);
        // 产生三个小组长
        Branch firstDevGroup = new Branch("杨三乜斜", "开发一组组长", 5000);
        Branch secondDevGroup = new Branch("吴大棒槌", "开发二组组长", 6000);
        // 剩下的就是俺们小兵
        Leaf a = new Leaf("a", "开发人员", 2000);
        Leaf b = new Leaf("b", "开发人员", 2000);
        Leaf c = new Leaf("c", "开发人员", 2000);
        Leaf d = new Leaf("d", "开发人员", 2000);
        Leaf e = new Leaf("e", "开发人员", 2000);
        Leaf f = new Leaf("f", "开发人员", 2000);
        Leaf g = new Leaf("g", "开发人员", 2000);

        Leaf h = new Leaf("h", "销售人员", 5000);
        Leaf i = new Leaf("i", "销售人员", 4000);

        Leaf j = new Leaf("j", "财务人员", 5000);
        Leaf k = new Leaf("k", "CEO秘书", 8000);
        Leaf xiaoLiu = new Leaf("小六", "研发副总", 20000);
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
//        System.out.println(ceo.getInfo());
        // 打印整个树
//        getAllSubordination(ceo.getSubordinationInfo());
        return ceo;
    }

    private static void getTreeInfo(ArrayList subordination) {
        int length = subordination.size();
        for (int i = 0; i < length; i++) {
            Object s = subordination.get(i);
            if (s instanceof Leaf) { // 是叶子节点, 员工
                Leaf leaf = (Leaf) s;
                System.out.println(leaf.getInfo());
            } else { Branch b = (Branch) s;
                System.out.println(b.getInfo());
                getTreeInfo(b.getSubordinationInfo());
            }
        }
    }
}
