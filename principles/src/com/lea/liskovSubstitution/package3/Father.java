package com.lea.liskovSubstitution.package3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lzc
 * @create 2020-10-18 15:26
 */
public class Father {

    public Collection doSomeThing(HashMap map) {
        System.out.println("父类被执行");
        return map.values();
    }
}
