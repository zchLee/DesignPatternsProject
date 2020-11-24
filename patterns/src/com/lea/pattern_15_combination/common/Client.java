package com.lea.pattern_15_combination.common;

import java.text.BreakIterator;

/**
 * @author lzc
 * @create 2020-11-23 15:55
 */
public class Client {

    public static void main(String[] args) {
        // 根节点
        Composite root = new Composite();
        root.doSomething();

        // 构件树枝节点
        Composite branch = new Composite();
        // 叶子节点
        Leaf leaf = new Leaf();
        // 组装
        branch.add(leaf);
        root.add(branch);


        display(root);
    }

    public static void display(Composite root) {
        for (Component child : root.getChildren()) {
            if (child instanceof Leaf)
                child.doSomething();
            else
                display((Composite) child);
        }
    }
}
