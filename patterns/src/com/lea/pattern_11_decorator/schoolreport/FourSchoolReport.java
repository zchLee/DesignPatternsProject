package com.lea.pattern_11_decorator.schoolreport;

/**
 * @author lzc
 * @create 2020-11-19 10:04
 */
public class FourSchoolReport extends SchoolReport {
    @Override
    public void report() {
        System.out.println("尊敬的XX家长");
        System.out.println("..................");
        System.out.println("语文 63 数学 73 体育 98 自然 63");
        System.out.println("..................");
        System.out.println("            家长签名：");
    }

    @Override
    public void sign(String name) {

    }
}
