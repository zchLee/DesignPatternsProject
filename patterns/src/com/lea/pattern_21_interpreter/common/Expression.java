package com.lea.pattern_21_interpreter.common;

/**
 * @author lzc
 * @create 2020-12-4 15:33
 */
public abstract class Expression {

    public abstract Object interpreter(Context context);
}
