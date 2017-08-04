package com.sun.test.designModel.jiegoumoshi.decorator;

import com.sun.test.designModel.jiegoumoshi.proxy.IRunner;

/**
 * Created by root on 17-8-4.
 */
public class RunnerWithJet implements IRunner {
    private IRunner iRunner;

    public RunnerWithJet(IRunner iRunner) {
        this.iRunner = iRunner;
    }

    @Override
    public void run() {
        System.out.printf("加快运动员的速度：为运动员增加喷气装置");
        this.iRunner.run();
    }
}
