package com.lea.liskovSubstitution.package1;

/**
 * @author lzc
 * @create 2020-10-18 14:40
 */
public class Client {

    public static void main(String[] args) {
        // 士兵根本不需要知道是什么枪，如果我们给一把玩具枪呢？为了避免拿到玩具枪杀不死人，但是有枪的一些特性，
        // 所以可以将玩具枪独立出来，另起一个玩具枪的实现，让它自由扩展，和其他的子类互不影响
        Soldier soldier1 = new Soldier("士兵1");
        soldier1.setGun(new Rifle());
        soldier1.killEnemy();

        // 给士兵2发一把玩具枪，看看效果
        Soldier soldier2 = new Soldier("拿玩具枪的士兵");
        soldier2.setGun(new ToyGun());
        soldier2.killEnemy();
    }
}
