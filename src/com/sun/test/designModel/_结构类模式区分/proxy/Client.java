package com.sun.test.designModel._结构类模式区分.proxy;

/**
 * Created by sunleic on 2017/8/4.
 * Version by ${VERSION}
 */
public class Client {
    public static void main(String args[]) {
        IRunner iRunner = new Runner();
        RunnerAgent runnerAgent = new RunnerAgent(iRunner);

        runnerAgent.run();
    }
}
