package com.lea.pattern_17_facade.sendletter;

/**
 * @author lzc
 * @create 2020-11-25 10:31
 */
public class Client {

    public static void main(String[] args) {
//        LetterProcessImpl letterProcess = new LetterProcessImpl();
//        letterProcess.writeContext("hello，this way");
//        letterProcess.fillEnvelope("tom home");
//        letterProcess.letterIntoEnvelop();
//        letterProcess.sendLetter();
        // 增加门面角色后
        ModenPostOffice postOffice = new ModenPostOffice();
        postOffice.sendLetter("hello, i'm tom", "jack home");
    }
}
