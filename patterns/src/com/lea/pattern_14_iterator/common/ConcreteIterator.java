package com.lea.pattern_14_iterator.common;

import java.util.Vector;

/**
 * @author lzc
 * @create 2020-11-21 15:18
 */
public class ConcreteIterator<T> implements Iterator<T> {
    private Vector<T> vector = new Vector<>();
    private int cursor = 0; // 定义游标

    public ConcreteIterator(Vector<T> vector) {
        this.vector = vector;
    }

    @Override
    public boolean hasNext() {
        if (cursor < vector.size())
            return true;
        return false;
    }

    @Override
    public <T> T next() {
        return (T) vector.get(cursor++);
    }

    @Override
    public boolean remove() {
        vector.remove(cursor);
        return true;
    }
}
