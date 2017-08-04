package com.sun.test.designModel.jiegoumoshi.decorator;

import com.sun.test.designModel.jiegoumoshi.proxy.IRunner;
import com.sun.test.designModel.jiegoumoshi.proxy.Runner;

/**
 * Created by root on 17-8-4.
 */
public class Client {
    public static void main(String args[]) {
        IRunner runner = new Runner();
        RunnerWithJet runnerWithJet = new RunnerWithJet(runner);
        runnerWithJet.run();
    }
}
