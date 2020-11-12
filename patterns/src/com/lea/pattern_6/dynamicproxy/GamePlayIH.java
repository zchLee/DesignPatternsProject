package com.lea.pattern_6.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author lzc
 * @create 2020-11-12 13:46
 */
public class GamePlayIH implements InvocationHandler {
    // 被代理的实例
    private Object obj = null;
    // 注入代理的目标实例
    public GamePlayIH(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(obj, args);
        if ("login".equalsIgnoreCase(method.getName())) {
            // 增强功能，如果有人登陆就给我发消息
            System.out.println("有人登你号");
        }
        return result;
    }
}
