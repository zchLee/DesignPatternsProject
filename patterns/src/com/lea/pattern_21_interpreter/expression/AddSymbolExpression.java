package com.lea.pattern_21_interpreter.expression;

import java.util.HashMap;

/**
 * @author lzc
 * @create 2020-12-4 13:49
 */
public class AddSymbolExpression extends SymbolExpression {
    public AddSymbolExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
