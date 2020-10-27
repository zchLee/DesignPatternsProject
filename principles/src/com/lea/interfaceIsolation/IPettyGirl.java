package com.lea.interfaceIsolation;

/**
 * @author lzc
 * @create 2020-10-27 10:45
 *
 * 根据接口隔离，将体态与气质分离成两个接口
 *  此接口没用了
 */
public interface IPettyGirl extends IGreatTemperamentGirl,IGoodBodyGirl {

    void goodLooking();

    void niceFigure();

    void greatTemperament();

}
