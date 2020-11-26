package com.lea.pattern_18_memento.change;

/**
 * @author lzc
 * @create 2020-11-26 10:11
 * 高层模块
 *   第一次改动：
 *      对于高层模块调用，仍然要关心备忘录。这对迪米特法则是一种亵渎，它告诉我们只和朋友类交流。
 *      对于高层模块来说，它最希望要做的就是创建一个被备份点，然后在需要时恢复这个备份点就成了，它不用关心到底有没有
 *      备忘录这个类，对此 建立一个管理备忘录的类
 */
public class Client {

    public static void main(String[] args) {
        // 声明主角
        Boy boy = new Boy();
        // 【改动】 声明管理备份类
        Caretaker caretaker = new Caretaker();
        // 初始当前状态。看到心上人
        boy.setState("心情很棒");
        System.out.println("========男孩现在的状态=======");
        System.out.println(boy.getState());
        // 需要记录下当前状态
//        Memento memento = boy.createMemento();
        caretaker.setMemento(boy.createMemento());
        // 男孩去追女孩，诶，失败了，心情改变
        boy.changeState();
        System.out.println("男孩追女孩之后的状态");
        System.out.println(boy.getState());

        // 追女孩失败了，那重来一次吧  重整心态，冲
//        boy.restoreMemento(memento);
        boy.restoreMemento(caretaker.getMemento());
        System.out.println("=====男孩恢复后的状态====");
        System.out.println(boy.getState());
    }
}
