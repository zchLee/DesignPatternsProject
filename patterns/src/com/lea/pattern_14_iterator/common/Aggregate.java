package com.lea.pattern_14_iterator.common;

/**
 * @author lzc
 * @create 2020-11-21 15:23
 */
public interface Aggregate<T> {

    void add(T t);

    void remove(T o);

    public Iterator<T> iterator();
}
