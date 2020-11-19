package com.lea.pattern_11_decorator.common;

/**
 * @author lzc
 * @create 2020-11-19 10:42
 */
public abstract class Decorator extends Component {
    private Component component;
    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void baseOperate() {
        this.component.baseOperate();
    }
}
