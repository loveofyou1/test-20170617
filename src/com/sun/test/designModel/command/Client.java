package com.sun.test.designModel.command;

/**
 * Created by sunleic on 2017/7/27.
 */
public class Client {
    public static void main(String[] main) {
        //定义我们的接头人
        Invoker invoker = new Invoker();//接头人就是小三
        System.out.println("------------客户要求增加一项需求---------------");
        //客户要求增加一项需求
        //客户给我们下命令来
        Command reqCommand = new AddRequirementCommand();
        Command delCommand = new DeletePageCommand();
        //接头人接收到命令
        invoker.setCommand(reqCommand);
        //接头人执行命令
        invoker.action();
        System.out.println("------------客户要求删除一项需求---------------");
        //接头人接收删除界面的命令
        invoker.setCommand(delCommand);
        //执行删除命令
        invoker.action();
    }
}
