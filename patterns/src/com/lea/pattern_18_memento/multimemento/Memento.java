package com.lea.pattern_18_memento.multimemento;

import java.util.Map;

/**
 * @author lzc
 * @create 2020-11-26 10:42
 */
public class Memento {
    private Map<String, Object> stateMap;

    // 构造函数传参
    public Memento(Map<String, Object> stateMap) {
        this.stateMap = stateMap;
    }

    public Map<String, Object> getStateMap() {
        return stateMap;
    }

    public void setStateMap(Map<String, Object> stateMap) {
        this.stateMap = stateMap;
    }
}
