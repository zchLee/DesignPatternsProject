package com.lea.pattern_14_iterator.ex;

import java.util.ArrayList;

/**
 * @author lzc
 * @create 2020-11-21 14:42
 */
public class ExIterator implements IExIterator<IEx> {
    private ArrayList<IEx> list = new ArrayList<>();

    public ExIterator(ArrayList<IEx> list) {
        this.list = list;
    }

    int currentItem = 0;

    @Override
    public boolean hasNext() {
        boolean b = true;
        if (currentItem >= list.size() || this.list.get(currentItem) == null)
            b = false;
        return b;
    }

    @Override
    public IEx next() {
        return list.get(currentItem++);
    }

    @Override
    public void remove() {
        // 暂时不需要这个方法
    }
}
