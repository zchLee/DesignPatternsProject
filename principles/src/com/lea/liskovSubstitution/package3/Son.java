package com.lea.liskovSubstitution.package3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lzc
 * @create 2020-10-18 15:27
 */
public class Son extends Father {

    // 方法重载 @Override会报错
//    @Override
    public Collection doSomeThing(Map map) {
        System.out.println("子类被执行");
        return map.values();
    }
}
