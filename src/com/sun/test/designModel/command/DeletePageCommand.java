package com.sun.test.designModel.command;

/**
 * Created by sunleic on 2017/7/27.
 */
public class DeletePageCommand extends Command {
    @Override
    public void execute() {
        //找到页面组
        super.pg.find();
        //删除一个页面
        super.rg.delete();
        //给出计划
        super.rg.plan();
    }
}
