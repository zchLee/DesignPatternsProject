package com.lea.pattern_17_facade.sendletter;

/**
 * @author lzc
 * @create 2020-11-25 10:27
 */
public class LetterProcessImpl implements ILetterProcess {
    @Override
    public void writeContext(String context) {
        System.out.println("写信内容：" + context);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("写上收信人地址：" + address);
    }

    @Override
    public void letterIntoEnvelop() {
        System.out.println("把信放到信封中");
    }

    @Override
    public void sendLetter() {
        System.out.println("邮寄信件...");
    }
}
