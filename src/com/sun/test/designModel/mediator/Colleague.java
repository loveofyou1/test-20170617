package com.sun.test.designModel.mediator;

/**
 * Created by sunleic on 2017/8/2.
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
