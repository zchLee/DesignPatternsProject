package com.lea.pattern_9_chainofresponsibility;

import com.lea.pattern_9_chainofresponsibility.common.ConcreteHandler_1;
import com.lea.pattern_9_chainofresponsibility.common.ConcreteHandler_2;
import com.lea.pattern_9_chainofresponsibility.common.Handler;
import com.lea.pattern_9_chainofresponsibility.common.HandlerChain;
import com.lea.pattern_9_chainofresponsibility.common.Level;
import com.lea.pattern_9_chainofresponsibility.common.Request;
import com.lea.pattern_9_chainofresponsibility.common.Response;

/**
 * @author lzc
 * @create 2020-11-18 10:08
 * 责任链模式
 *      使多个对象都有机会处理请求，从而避免了请求的发送者和接收者之间的耦合关系，
 *      将这些对象连成一条链，并沿着这条链传递该请求，直到有对象处理它为止
 * 责任链模式的重点是在“链”，由上一条链去处理相似的请求在链中决定谁来处理，并返回相应的结果
 *
 * 责任链中重要的角色：
 *  抽象处理者：实现了三个职责
 *      1. 定义了请求处理方法，唯一对外开放的方法 ->handlerMessage()
 *      2. 定义一个链的编排方法               ->setNextHandler()
 *      3. 定义了一个具体的请求者必须实现的方法：定义自己能处理的级别，getHandlerLevel和具体的处理任务方法-》response
 * 注意点：
 *  在实际应用中，一般会有一个封装类对责任链模式进行封装，也就是替代Client类，直接返回链中第一个处理者，具体设置
 *  不需要高层次模块关系，更简化了高层次模块的调用，减少模块间的耦合，提高系统的灵活性
 *
 *  优点：
 *      将请求和处理分开，请求者可以不用知道是谁处理的，处理者可以不用知道请求的全貌，两者解耦，提高系统的灵活性
 *  缺点：
 *      一是性能问题，每个请求都从链头遍历到链尾，当链比较长的时候，性能是一个非常大的问题
 *      二是调试不是很方便，当链条比较长时，由于采用了递归，调试的时候逻辑可能比较复杂
 *       注意点：
 *          链中的节点数量需要控制，避免超长链条的出现，一般的做法是在Handler中，设置一个最大节点数量，
 *       在setNext方法判断是否超过阈值，超过不允许该链建立，避免无意识的破坏系统性能
 */
public class ChainOfResponsibility {

    public static void main(String[] args) {
//        // 声明所有节点
//        Handler c1 = new ConcreteHandler_1();
//        Handler c2 = new ConcreteHandler_2();
//        // 设置责任链的顺序 1-2
//        c1.setNextHandler(c2);
        // 封装后
        Handler c1 = HandlerChain.getHandlerChain();
        // 提交处理，返回结果
        Response response = c1.handlerMessage(new Request(Level.TWO));
    }
}
