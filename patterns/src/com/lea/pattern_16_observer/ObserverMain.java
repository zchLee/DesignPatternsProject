package com.lea.pattern_16_observer;

import com.lea.pattern_16_observer.common.ConcreteObserver;
import com.lea.pattern_16_observer.common.ConcreteSubject;

import javax.crypto.interfaces.PBEKey;

/**
 * @author lzc
 * @create 2020-11-24 10:25
 * 观察者模式，也叫发布订阅模式【重用设计模式】
 *      定义对象间一种一对多的依赖关系，使得每当一个对象改变状态时，则所有依赖于它的对象都会得到通知并自动更新
 * 观察者的几种角色解释：
 * Subject 被观察者：
 *      定义观察者必须实现的职责，它必须能够动态的添加，取消观察者。它一般是抽象类或者是实现类，仅仅完成作为
 *      被观察者必须实现的职责：管理观察者和通知观察者
 * Observer 观察者：
 *      观察者接受到消息后，即进行update(更新方法)操作，对接受到的信息进行处理
 * ConcreteSubject 具体被观察者：
 *      定义被观察者自己的业务逻辑，同事定义对那些事情进行通知
 * ConcreteObserver 具体观察者：
 *      每个观察在接受到信息后的处理反应是不同的，各个观察者有自己的处理逻辑
 *
 * 优点：
 *  1.建立一套触发机制
 *  2.观察者模式和被观察者之间是抽象耦合的
 *      如此设计不管是增加抽象者还是增加本观察者都非常容易
 * 缺点：
 *  开发效率和运行效率问题。在java中消息通知默认是顺序执行的，一个观察者卡壳，会影响整体的执行效率
 *  多级触发时，效率更是让人堪忧、
 *
 * 使用场景：
 *      1.关联行为场景时。需要注意的是，关联行为是可拆分的，而不是“组合” 关系
 *      2.事件多级触发场景
 *      3.跨系统的消息场景交换，如消息队列的处理机制
 */
public class ObserverMain {

    public static void main(String[] args) {
        // 监视者
        ConcreteObserver observer = new ConcreteObserver();
        // 被监视者
        ConcreteSubject subject = new ConcreteSubject();

        subject.addObserver(observer);
        subject.doSomeThing("张三在吃饭");
    }
}
