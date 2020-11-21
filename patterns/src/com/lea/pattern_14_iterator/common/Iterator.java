package com.lea.pattern_14_iterator.common;

/**
 * @author lzc
 * @create 2020-11-21 15:17
 */
public interface Iterator<T> {

    boolean hasNext();

    <T> T next();

    boolean remove();
}
