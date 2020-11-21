package com.lea.pattern_14_iterator.common;

import java.util.Vector;

/**
 * @author lzc
 * @create 2020-11-21 15:26
 */
public class ConcreteAggregate<T> implements Aggregate<T> {

    private Vector<T> vector = new Vector<>();

    @Override
    public void add(T t) {
        vector.add(t);
    }

    @Override
    public void remove(T o) {
        vector.remove(o);
    }

    // 返回迭代器
    @Override
    public Iterator<T> iterator() {
        return new ConcreteIterator<>(vector);
    }
}
