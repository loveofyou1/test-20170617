package com.sun.test.designModel.jiegoumoshi.proxy;

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
