package com.lea.pattern_14_iterator.ex;

import java.util.ArrayList;

/**
 * @author lzc
 * @create 2020-11-21 14:23
 */
public class Ex implements IEx {

    private ArrayList<IEx> exList = new ArrayList<>();

    private String name;

    private int age;
    // 第几个
    private int num;

    public Ex() {}

    @Override
    public void add(int num, String name, int age) {
        exList.add(new Ex(name, age, num));
    }

    private Ex(String name, int age, int num) {
        this.name = name;
        this.age = age;
        this.num = num;
    }

    @Override
    public String getExInfo() {
        return "第" + num + "个前任：" + name + "," + age + "岁";
    }

    @Override
    public IExIterator iterator() {
        return new ExIterator(this.exList);
    }
}
