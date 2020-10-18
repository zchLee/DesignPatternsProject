package com.lea.liskovSubstitution.package3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lzc
 * @create 2020-10-18 15:20
 * 根据接口或
 *  里士替换指定了一个契约设计（Design by contract）,就是父类或接口，方法中的输入参数称为前置条件。
 *      前置条件就是你要让我执行，就必须满足我的条件。
 *      后置条件就是我执行完了需要反馈，标准是什么？ 来看个例子，先定义个Father类
 */
public class Client {

    public static void main(String[] args) {
        invokerFather();
    }

    public static void invokerFather() {
//        Father father = new Father();
        // 此时两次调用结果一致，子类方法永远不会被调用。要想子类方法被调用，就必须重写父类方法
        // 当父类输入参数类型宽于子类的输入类型会出现的问题？
        /**
         * 父类存在的地方，子类未必能存在，因为一旦把子类作为参数传入，调用者就很有可能进入子类的方法范畴
         * 子类在没有重写父类的情况下，子类被执行，这会使业务逻辑混乱
         * 所以子类中方法前置条件必须与超类中被重写的前置条件相同或更加宽松
         */
        Son father = new Son();
        HashMap map = new HashMap();
        father.doSomeThing(map);
    }
}
