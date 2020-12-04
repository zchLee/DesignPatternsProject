package com.lea.pattern_21_interpreter.expression;

import java.util.HashMap;

/**
 * @author lzc
 * @create 2020-12-4 13:33
 * 抽象表示式列
 */
public abstract class Expression {
    // 解析公式和数值，其中var的key值是公式的参数，value值是具体的数字
    public abstract int interpreter(HashMap<String, Integer> var);
}
