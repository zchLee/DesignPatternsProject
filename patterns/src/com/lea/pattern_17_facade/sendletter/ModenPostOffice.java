package com.lea.pattern_17_facade.sendletter;

/**
 * @author lzc
 * @create 2020-11-25 10:29
 */
public class ModenPostOffice {

    private ILetterProcess letterProcess;

    public void sendLetter(String context, String address) {
        letterProcess = new LetterProcessImpl();
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);
        letterProcess.letterIntoEnvelop();
        letterProcess.sendLetter();
    };
}
