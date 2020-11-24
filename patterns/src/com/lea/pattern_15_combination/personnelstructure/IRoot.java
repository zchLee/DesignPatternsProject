package com.lea.pattern_15_combination.personnelstructure;

import java.util.ArrayList;

/**
 * @author lzc
 * @create 2020-11-23 11:01
 */
public interface IRoot {
    // 得到总经理信息
    String getInfo();
    // 总经理下面有小兵，得有增加小兵，比如研发经理，这是一个树枝节点
    void add(IBranch branch);
    // 增加叶子节点
    void add(ILeaf leaf);
    // 既然能增加，那就要能遍历
    ArrayList getSubordinationInfo();
}
