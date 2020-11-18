package com.lea.pattern_2_factory.lazyinit;

import com.lea.pattern_2_factory.factory.ConcreteProduct;
import com.lea.pattern_2_factory.factory.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lzc
 * @create 2020-11-6 16:05
 * 产品工厂
 */
public class ProductFactory {
    // 通过prMap产生缓存，对需要再次被重用的对象保留
    public static Map<String, Product> prMap = new HashMap<>();

    public static synchronized Product createProduct(String type) {
        Product product = null;
        // 如果Map中已经有这个对象
        if (prMap.containsKey(type)) {
            prMap.get(type);
        } else {
            if ("product1".equals(type)) {
                product = new ConcreteProduct();
            }else {
                product = new ConcreteProduct2();
            }
            // 把创建好的 产品放到缓存中，便于复用
            if (null != product)
                prMap.put(type, product);
        }
        return product;
    }
}
