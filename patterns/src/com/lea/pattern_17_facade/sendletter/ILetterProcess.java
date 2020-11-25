package com.lea.pattern_17_facade.sendletter;

/**
 * @author lzc
 * @create 2020-11-25 10:26
 */
public interface ILetterProcess {
    void writeContext(String context);
    void fillEnvelope(String address);
    void letterIntoEnvelop();
    void sendLetter();
}
