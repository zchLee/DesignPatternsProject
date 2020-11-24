package com.lea.pattern_15_combination.personnelstructure2;


import com.lea.pattern_15_combination.personnelstructure.IBranch;
import com.lea.pattern_15_combination.personnelstructure.ILeaf;

import java.util.ArrayList;

/**
 * @author lzc
 * @create 2020-11-23 11:13
 */
public class Branch extends Corp {

    private ArrayList subordinationList = new ArrayList();


    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    // 可能是小兵，也可能是头目
    public void add(Corp corp) {
        this.subordinationList.add(corp);
    }

//    public void add(ILeaf leaf) {
//        this.subordinationList.add(leaf);
//    }

    public ArrayList getSubordinationInfo() {
        return  this.subordinationList;
    }
}
