package com.lea.pattern_21_interpreter.expression;

import java.util.HashMap;

/**
 * @author lzc
 * @create 2020-12-4 13:35
 * 变量解析器
 */
public class VarExpression extends Expression {

    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(key);
    }
}
