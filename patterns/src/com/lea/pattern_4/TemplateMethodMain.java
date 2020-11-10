package com.lea.pattern_4;

import com.lea.pattern_4.car.HummerH1Model;
import com.lea.pattern_4.car.HummerModel;
import com.lea.pattern_4.templatemethod.AbstractTemplate;
import com.lea.pattern_4.templatemethod.ConcreteTemplate;
import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;

import java.util.Scanner;

/**
 * @author lzc
 * @create 2020-11-10 11:24
 * 模板方法模式：
 *      定义一个操作中的算法框架，而将一些步骤延迟到子类中。
 *    使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤
 *
 * 注意点：
 *  1.模板方法中的 基本方法尽量设计为 protected类型，符合迪米特原则，不需要暴露的属性或方法尽量不要设置为protected类型。
 *      实现类若非必要，尽量不要扩大父类中的访问权限
 *
 * 模板方法模式的优点：
 *   1.封装不变的部分，扩展可变部分
 *      把认为不变的算法封装到父类实现，而可变部分的则可以通过继承，让子类来继续扩展
 *   2.提取公共的代码，便于维护
 *      比如模板方法中的 run方法，每个子类实现的 run方法都一样，不如就讲他放在父类
 *   3.行为由父类控制，子类实现
 *      基本方法是由子类实现，因此子类可以通过扩展的方式增加相应的功能，符合开闭原则
 * 缺点：
 *  1.对新手不友好。模板方法 是有子类来改变父类，在复杂项目中会带来代码阅读难度，而且会让新手产生不适应感
 *
 * 使用场景：
 *  1.多个子类有公共的方法，并且逻辑相同时。
 *  2.重要、复杂算法，可以把核心算法设计为模板方法，周边的相关细节功能则由各个子类实现
 *  3.重构时，模板方法是一个经常使用的模式，把相同代码抽取到父类中，然后通过钩子函数约束其行为
 *
 *
 * 模板方法模式的扩展：
 *  1.使用钩子方法改变模板方法执行顺序结果
 *
 * 在父类怎么调用子类的方法？
 *  1.使用父类构造参数，传入子类
 *  2.使用反射
 *  3.使用子类静态方法
 * 可以，但是没必要在父类中调用子类的方法。模板方法解决了这个痛点
 */
public class TemplateMethodMain {

    public static void main(String[] args) {
//        AbstractTemplate template = new ConcreteTemplate();
//        template.run();
        // 以悍巴马模型为例
        HummerH1Model hummer = new HummerH1Model();

        // 增加了钩子方法后，由用户选择启动模型要不要鸣笛
        System.out.println("-------------H1型号悍马------------");
        System.out.println("H1型号的悍马是否需要喇叭声响？ 0--不需要  1--需要");
        Scanner sc = new Scanner(System.in);
        boolean b = sc.hasNextLine();
        if (b) {
            String str = sc.nextLine();
            if ("0".equals(str)) {
                // 改变了模板方法规定的执行顺序
                hummer.setAlarm(false);
            }
        }
        hummer.run();
    }
}
