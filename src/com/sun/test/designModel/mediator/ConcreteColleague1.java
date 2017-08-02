package com.sun.test.designModel.mediator;

/**
 * Created by sunleic on 2017/8/2.
 */
public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void selfMethod1() {
        //do Something
    }

    public void dependMethod1() {
        this.mediator.doSomething1();
    }
}
