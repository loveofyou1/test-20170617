package com.sun.test.designModel.state;

/**
 * Created by sunleic on 2017/7/29.
 */
public class Context {
    //定义出所有的电梯状态
    public final static OpenningState openningState = new OpenningState();
    public final static ClosingState closeingState = new ClosingState();
    public final static RunningState runningState = new RunningState();
    public final static StoppingState stoppingState = new StoppingState();

    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public void run() {
        this.liftState.run();
    }

    public void open() {
        this.liftState.open();
    }

    public void stop() {
        this.liftState.stop();
    }

    public void close() {
        this.liftState.close();
    }
}
