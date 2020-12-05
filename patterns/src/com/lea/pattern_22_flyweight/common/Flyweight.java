package com.lea.pattern_22_flyweight.common;

/**
 * @author lzc
 * @create 2020-12-5 15:42
 * 抽象享元角色一般为抽象类，在实际项目中，一般是一个实现类，它是描述一类事物的方法。在抽象角色中
 *  一般需要把外部和内部状态定义出来（当然可以没有内部状态），避免子类的随意扩展。
 */
public abstract class Flyweight {
    // b内部状态
    private String intrinsic;
    // 外部状态
    protected final String Extrinsic;
    // 要求享元角色必须接受外部状态
    public Flyweight(String extrinsic) {
        Extrinsic = extrinsic;
    }
    // 业务操作
    public abstract void operate();

    // 内部状态的getter\setter
    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
