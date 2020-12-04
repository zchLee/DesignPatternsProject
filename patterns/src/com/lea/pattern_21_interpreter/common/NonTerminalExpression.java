package com.lea.pattern_21_interpreter.common;

/**
 * @author lzc
 * @create 2020-12-4 15:36
 * 非终结符
 */
public class NonTerminalExpression extends Expression {

    // 非终结符表达式都会对其他表达式产生依赖
    public NonTerminalExpression(Expression... expressions) {
        //
    }

    @Override
    public Object interpreter(Context context) {
        // 文法处理
        return null;
    }
}
