package com.lea.pattern_15_combination.common;

import java.util.ArrayList;

/**
 * @author lzc
 * @create 2020-11-23 15:41
 * 组合模式最重要的重点就再树枝构件
 */
public class Composite extends Component {
    private ArrayList<Component> components = new ArrayList<>();

    public void add(Component component) {
        this.components.add(component);
    }

    public void remove(Component component) {
        this.components.remove(component);
    }

    public ArrayList<Component> getChildren() {
        return components;
    }
}
