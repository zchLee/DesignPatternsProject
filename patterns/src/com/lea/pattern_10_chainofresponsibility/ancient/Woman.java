package com.lea.pattern_10_chainofresponsibility.ancient;

/**
 * @author lzc
 * @create 2020-11-18 10:17
 */
public class Woman implements IWoman {
    /*
    定义一个int类的参数来描述妇女的个人状况
    1--未出嫁
    2--已出嫁
    3--丧偶
     */
    private int type = 0;
    private String request;

    public Woman(int type, String request) {
        this.type = type;
        this.request = request;
    }



    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        switch (this.type) {
            case 1:
                this.request = "女儿的请求是：" + request;
                break;
            case 2:
                this.request = "妻子的请求是：" + request;
                break;
            case 3:
                this.request = "母亲的请求是：" + request;
                break;
        }
        return this.request;
    }
}
