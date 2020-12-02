package com.lea.pattern_19_visitor.common;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.TypeHost;

/**
 * @author lzc
 * @create 2020-12-2 10:35
 * 抽象元素
 */
public abstract class Element {
    // 定义公共业务逻辑
    public abstract void doSomething();
    // 允许谁来访问
    public abstract void accept(IVisitor visitor);
}
