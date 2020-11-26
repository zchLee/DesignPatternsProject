package com.lea.pattern_18_memento.multimemento;

/**
 * @author lzc
 * @create 2020-11-26 13:45
 * 多状态下的高级模块
 */
public class MultiClient {

    public static void main(String[] args) {
        Originator originator = new Originator();
        // 管理员
        Caretaker caretaker = new Caretaker();

        // 初始化
        originator.setState1("1");
        originator.setState2("2");
        originator.setState3("3");
        System.out.println("初始化\n" + originator);
        // 创建一个备忘录
        caretaker.setMemento(originator.createMemento());

        // 修改状态
        originator.setState1("4");
        originator.setState2("5");
        originator.setState3("6");
        System.out.println("修改后\n" + originator);

        // 恢复
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("恢复后\n" + originator);
    }
}
