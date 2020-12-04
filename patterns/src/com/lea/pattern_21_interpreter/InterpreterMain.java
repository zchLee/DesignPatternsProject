package com.lea.pattern_21_interpreter;

import com.lea.pattern_21_interpreter.common.Context;
import com.lea.pattern_21_interpreter.common.Expression;
import com.lea.pattern_21_interpreter.common.TerminalExpression;


import java.util.Stack;

/**
 * @author lzc
 * @create 2020-12-4 13:32
 * 解释器模式是一种按照规定语法进行解析的方案
 *  定义是：给定一门语言，定义它的文法的一种表示，并定义一个解释器，解释器使用该表示来解释语言中的句子
 *
 * 解释器有这么个角色
 *  AbstractExpress  抽象解释器
 *      具体的解释任务由各个实现类完成，具体的解释器分别由TerminalExpress和NonTerminalExpress完成
 *  TerminalExpression   终结符表示式
 *      实现与文法中的元素相关联的解释操作。通常是一个解释器模式中只有一个终结符表达式，但有多个实例，对应不同的终结符。
 *  NonTerminalExpression 非终结符表达式
 *      文法中的每一条规则，都对应一个非终结符表达式，具体到我们的例子就是加减法则分别对应到AddExpression、SubExoression
 *      非终结符表达式根据逻辑的复杂程度而增加，原则上每个文件规则都对应一个非终结符表达式
 *  Context         环境角色
 *      具体到例子中是采用HashMao代替
 *
 *  每个非终结符表达式都表示一个文法规则，并且这个文法规则只关心自己周边的文法规则结果（注意是结果），因此就产生了每个非终结符
 *  表达式调用自己的非终结符表达式，然后最终、最小的文法规则就是终结符表达式，终结符表达式的概念就是，
 *  不能参与比自己更小的文件算法了。
 *
 *  使用场景：
 *      1.重复发生的问题可以使用解释器模式
 *      2.一个简单的语法需要解释的场景
 */
public class InterpreterMain {

    // 此部分通常是一个封装类，封装结果就是传递一个语法文件，解析器分析后产生结果并返回，避免调用者与语法解析器的耦合关系
    public static void main(String[] args) {
        Context context = new Context();
        // 通常定义一个语法容器，容纳一个完整的表达式。通常为ArrayList,LinkedList，Stack
        Stack<Expression> stack = new Stack<>();
        for (;;) {
            // 语法判断，产生递归调用
            stack.push(new TerminalExpression());
            break;
        }
        // 产生一个完整的语法树，由各个具体的语法分析进行解析
        Expression expression = stack.pop();
        // 具体元素进入场景
        expression.interpreter(context);
    }
}
