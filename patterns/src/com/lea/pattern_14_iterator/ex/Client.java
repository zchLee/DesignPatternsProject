package com.lea.pattern_14_iterator.ex;

import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author lzc
 * @create 2020-11-21 14:22
 * 张三有天啊，心血来潮，想数数自己有多少个前任
 * 数完一想，不对劲a，这数的时候别人知道了我前女友隐私啊，那整个迭代器模式吧
 */
public class Client {

    public static void main(String[] args) {
        Random random = new Random();
//        ArrayList<IEx> exList = new ArrayList<>();
//        exList.add(new Ex("王祖贤", 27, 1));
//        exList.add(new Ex("刘亦菲", 18, 2));
//        exList.add(new Ex("小笼包", 17, 3));
//
//        for (int i = 4; i < 20; i++) {
//            exList.add(new Ex("第" + i + "个女友", random.nextInt(12) + 18, i));
//        }
//
//        // 遍历前女友
//        for (IEx ex : exList) {
//            System.out.println(ex.getExInfo());
//        }

        // 增加了迭代器之后， Ex更新是一个容器，只负责增加就成，遍历有专业的
        Ex ex = new Ex();
        ex.add(1,"王祖贤", 27);
        ex.add(2,"刘亦菲", 18);
        ex.add(3,"小笼包", 17);
        for (int i = 4; i < 20; i++) {
            ex.add(i, "第" + i + "个女友", random.nextInt(12) + 18);
        }

        IExIterator<IEx> iterator = ex.iterator();
        while (iterator.hasNext()) {
            IEx exInfo = iterator.next();
            System.out.println(exInfo.getExInfo());
        }
    }
}
