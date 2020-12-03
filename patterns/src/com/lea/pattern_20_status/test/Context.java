package com.lea.pattern_20_status.test;

/**
 * @author lzc
 * @create 2020-12-3 14:39
 * 上下文类
 *  串联各个状态的过渡，在LiftState状态类中我们定义并把这个环境角色聚合进来，并传递到子类，由四个具体实现类
 *  根据自己的环境来决定如何进行状态的过渡。
 */
public class Context {
    // 定义所有的电梯状态
    public final static OpenState openingState = new OpenState();
    public final static CloseState closingState = new CloseState();
    public final static RunState runningState = new RunState();
    public final static StopState stopState = new StopState();

    // 定义当前电梯状态
    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

//    public void open() {
//        this.liftState.open();
//    }
//
//    public void close() {
//        this.liftState.close();
//    }
//
//    public void run() {
//        this.liftState.run();
//    }
//
//    public void stop() {
//        this.liftState.stop();
//    }


}
