package com.lea.pattern_21_interpreter.expression;

import java.util.HashMap;

/**
 * @author lzc
 * @create 2020-12-4 13:46
 * 运算符号抽象解析器，每个符号都只和自己左右两个数字有关系，但左右两个数字有可能也是一个解析的结果，无论是哪种都是Expression类型
 * 于是在对运算符解析的子类增加一个构造器，传递左右两个表达式。
 */
public abstract class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;
    // 所有解析公式都只关心自己两边的表达式结果
    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
