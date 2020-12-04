package com.lea.pattern_21_interpreter.common;

/**
 * @author lzc
 * @create 2020-12-4 15:34
 */
public class TerminalExpression extends Expression {
    // 终结符 一般只有一个，但是可以有多个实例
    @Override
    public Object interpreter(Context context) {
        return null;
    }
}
