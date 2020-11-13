package com.lea.pattern_7.sendEmail;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author lzc
 * @create 2020-11-13 10:11
 * 数量少的解决了，但是多数据量的呢？
 *  用多线程,
 *      然而用多线程也有问题，两个线程抢Mail对象，第一个线程还没发出去，第二个线程就来修改了mail对象，
 *      解决办法:
 *          1.通过一种新型模式来解决这个问题：
 *              通过对象的复制功能来解决这个问题
 *              Mail类增加clone()方法
 */
public class Client {

    private static int MAX_COUNT = 6;

    public static void main(String[] args) {
        // 模拟发送短信
        int i = 0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("版权归版主所有");
        while (i < MAX_COUNT) {
            // 针对多线程 新增改动
            Mail clone = mail.clone();  // 将对象复制一份，产生一个新的对象
            clone.setAppellation(getRandString(5) + "先生（女士）");
            clone.setReceiver(getRandString(8) + "@" + getRandString(5));
            sendMail(clone);
            i++;
        }
    }

    // 发送邮件
    public static void sendMail(Mail mail) {
        System.out.println("标题：" + mail.getSubject() + "\t收件人：" + mail.getReceiver() + "\t...发送成功！");
    }

    // 获得指定长度的随机字符串
    public static String getRandString(int maxNum) {
        String source = "qwetyuiopasdfghjklmnbvcxzQWERTYUIOPASDFGHJKLMNBVCXZ";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for (int i = 0; i < maxNum; i++) {
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }

}
