package com.lea.pattern_21_interpreter.expression;

import java.util.HashMap;
import java.util.Stack;
import java.util.stream.IntStream;

/**
 * @author lzc
 * @create 2020-12-4 13:51
 * 对解析器进行封装，封装类
 */
public class Calculator {
    // 定义表达式
    private Expression expression;
    // 定义构造函数 并解析
    public Calculator(String expStr) {
        // 定义一个栈，安排运算的先后顺序
        Stack<Expression> stack = new Stack<>();
        char[] chars = expStr.toCharArray();
        // 运算
        Expression left = null;
        Expression right = null;
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new AddSymbolExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new SubSymbolExpression(left, right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(chars[i])));
            }
        }
        // 把运算结果抛出来
        this.expression = stack.pop();
    }

    // 开始运算
    public int run(HashMap<String, Integer> var) {
        return this.expression.interpreter(var);
    }
}
