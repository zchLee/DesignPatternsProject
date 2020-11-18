package com.lea.pattern_7_prototype;

import java.util.ArrayList;

/**
 * @author lzc
 * @create 2020-11-13 10:03
 * 原型模式：
 *  用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象
 *
 *  原型模式如下 在jdk中 只有 实现了 implements Cloneable 标识接口的类才可以复制，复制一个新的对象
 *
 *  优点：
 *      1.原型模式是在内存二进制流的拷贝，要比直接new 一个对象性能好的多，
 *          特别是要在一个循环内产生大量对象时，原型模式可以更好的体现其优点
 *      2.逃避构造函数的约束，这既是优点也是缺点，直接在内存中拷贝，构造函数是不会执行的，优点是减少了约束，
 *          缺点也是减少了约束，需要大家在实际应用时考虑
 *
 *   使用场景：
 *      1.资源优化场景
 *          类初始化需要消耗非常多的资源，这个资源包括数据、硬件资源等
 *      2.性能和安全要求的场景
 *          通过new产生一个对象需要非常繁琐的数据准备或访问权限，则可以使用prototype patterns（原型模式）
 *      3.一个对象多个修改者的场景
 *          一个对象需要提供给其他的对象访问，而且各个调用者都需要修改对象值时，可以考虑使用原型模式拷贝
 *          多个对象供多个对象调用者使用
 *      在实际项目中，原型模式很少单独出现，一般是和工厂方法模式一起出现，通过clone的方法复制对象，然后由工厂方法
 *      提供给调用者。原型模式已经跟java融合一体，可以随手拿来使用
 *
 *  注意事项:
 *      1.clone得到一个对象时，构造方法不会被执行
 *      2.浅拷贝和深拷贝
 *          浅拷贝: Object类提供的方法clone只是拷贝本对象，其对象内部的数组、引用对象等都不拷贝，
 *              还是指向原生对象的内存地址，这种拷贝就叫做浅拷贝。
 *              这样会产生，a\b两个对象，修改引用时，是都会给对方看到修改的效果的
 *          深拷贝：拷贝本对象 包括对象内部的数组及引用对象。
 *          这样两个拷贝对象，修改属性引用时，不会影响对方
 *      3.clone 和 final不可同时存在
 */
public class PrototypeMain implements Cloneable {
    // 验证浅拷贝
    private ArrayList<Integer> list = new ArrayList<>();
    public PrototypeMain() {
        System.out.println("构造函数被执行");
    }

    @Override
    protected PrototypeMain clone() {
        PrototypeMain prototype = null;
        try {
            prototype = (PrototypeMain) super.clone();
            // 深拷贝，将对象引用也拷贝过去
            prototype.list = (ArrayList<Integer>) this.list.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public void setList(Integer value) {
        this.list.add(value);
    }

    public static void main(String[] args) {
        PrototypeMain prototype = new PrototypeMain();
        prototype.setList(3);
        PrototypeMain clone = prototype.clone();
        clone.setList(4);
        // 浅拷贝问题 出现 [3, 4]。 应该 只出现[3]
        System.out.println(prototype.list.toString());
    }
}
