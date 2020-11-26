package com.lea.pattern_18_memento.multimemento;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lzc
 * @create 2020-11-26 11:41
 */
public class BeanUtil {

    // 将bean的所有属性及数值放入到HashMap中
    public static HashMap<String, Object> backupProp(Object o) {
        HashMap<String, Object> map = new HashMap<>();
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(o.getClass());
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor d : descriptors) {
                // 属性名
                String name = d.getName();
                // 读取属性方法
                Method getter = d.getReadMethod();
                // 读取属性值
                Object fieldValue = getter.invoke(o);
                if (!name.equalsIgnoreCase("class")) {
                    map.put(name, fieldValue);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    /**
     * 将状态写入实体类
     * @author: lzc
     * @date: 2020-11-26 13:38
     * @param o
     * @param map
     * @return: void
     */
    public static void restoreProp(Object o, Map<String, Object> map) {
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(o.getClass());
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor d : descriptors) {
                // 属性名
                String name = d.getName();

                if (map.containsKey(name)) {
                    // 读取属性方法
                    Method setter = d.getWriteMethod();
                    // 读取属性值
                    setter.invoke(o, map.get(name));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
