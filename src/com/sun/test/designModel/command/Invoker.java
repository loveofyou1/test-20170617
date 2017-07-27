package com.sun.test.designModel.command;

/**
 * Created by sunleic on 2017/7/27.
 */
public class Invoker {
    //什么命令
    private Command command;

    //设置命令
    public void setCommand(Command _command) {
        this.command = _command;
    }

    //执行客户命令
    public void action() {
        this.command.execute();
    }
}
