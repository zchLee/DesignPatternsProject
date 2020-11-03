package com.lea.lawofdemeter;

/**
 * @author lzc
 * @create 2020-10-28 09:57
 *
 * 迪米特法则（law of Demeter, LoD）也称为最少知识原则（Least Knowledge principle,LKP）
 *     一个对象应该对其他对象有最少的了解。
 *     通俗来讲，一个类应该对自己需要耦合的或调用的类知道最少
 *     only take to your immedate friends
 *
 *  类和类之间的关系，由类来维护而不是方法，但是类和类之间又不能太亲密  见eg2包下的类
 *
 *  迪米特法则要求类 “羞涩” 一点，尽量不要对外公布太多的public方法和非静态方法，public变量，尽量内敛，多使用，private，protected、packe-private
 *
 * 原则：
 *  当一个方法放在本类中没错。放在其他类中也没有错的时候，可以坚持一个原则
 *  当一个方法放在本类中，即不增加类间关系，也对本类不产生负面影响，就放置在本类中
 */
public class Main {
}
