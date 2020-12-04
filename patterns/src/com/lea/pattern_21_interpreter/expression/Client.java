package com.lea.pattern_21_interpreter.expression;


import java.io.IOError;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;


/**
 * @author lzc
 * @create 2020-12-4 14:10
 * 模拟用户输入表达式，运算公式
 */
public class Client {

    public static void main(String[] args) {
        String expStr = getExpStr();
        // 赋值
        HashMap<String, Integer> data = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        System.out.println("运算结果：" + expStr + "=" + calculator.run(data));
    }

    // 输入表达式
    public static String getExpStr() {
        System.out.println("请输入表达式：");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine())
            return scanner.nextLine();
        return "";
    }

    // 获得值映射
    public static HashMap<String, Integer> getValue(String expStr) {
        HashMap<String, Integer> data = new HashMap<>();
        for (Character c : expStr.toCharArray()) {
            if (c != '+' && c != '-') {
                if (!data.containsKey(c.toString())) {
                    System.out.println("请输入" + c + "的值：");
                    Scanner scanner = new Scanner(System.in);
                    int i = scanner.nextInt();
                    data.put(c.toString(), i);
                }
            }
        }
        return data;
    }
}
