package com.sun.test.designModel.state;

/**
 * Created by sunleic on 2017/7/29.
 */
public abstract class LiftState {
    //定义一个环境角色，也就是状态引起的功能变化
    protected Context context;

    public void setContext(Context _context) {
        this.context = _context;
    }

    public abstract void open();

    public abstract void close();

    public abstract void run();

    public abstract void stop();
}
