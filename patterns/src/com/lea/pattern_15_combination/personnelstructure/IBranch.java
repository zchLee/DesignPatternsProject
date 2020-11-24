package com.lea.pattern_15_combination.personnelstructure;

import java.util.ArrayList;

/**
 * @author lzc
 * @create 2020-11-23 11:01
 */
public interface IBranch {
    // 获得信息
    String getInfo();
    // 增加数据节点，例如研发部下设的一组
    void add(IBranch branch);
    // 增加叶子节点
    void add(ILeaf leaf);
    // 获得下级信息
    public ArrayList getSubordinationInfo();
}
