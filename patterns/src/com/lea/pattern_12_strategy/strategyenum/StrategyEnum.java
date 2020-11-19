package com.lea.pattern_12_strategy.strategyenum;

/**
 * @author lzc
 * @create 2020-11-19 14:10
 */
public enum StrategyEnum {

    ADD("+") {
        // enum中声明了 抽象类，不实现会运行失败
        @Override
        public int exec(int a, int b) {
            return a + b;
        }
    },
    SUB("-") {
        @Override
        public int exec(int a, int b) {
            return a - b;
        }
    };

    private String type = "";

    public String getType() {
        return type;
    }
    
    public static StrategyEnum getEnum(String type) {
        StrategyEnum se = null;
        for (StrategyEnum strategy : StrategyEnum.values()) {
            if (strategy.type.equals(type)) {
                se = strategy;
                break;
            }
        }
        return se;
    }

    StrategyEnum(String type) {
        this.type = type;
    }
    // 声明一个抽象函数
    public abstract int exec(int a, int b);
}
