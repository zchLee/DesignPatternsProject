package com.lea.pattern_11_decorator.common;

/**
 * @author lzc
 * @create 2020-11-19 10:41
 * 具体构建
 */
public class ConcreteComponent extends Component {
    @Override
    public void baseOperate() {
        System.out.println("做最基本的事，每天进步一小步");
    }
}
