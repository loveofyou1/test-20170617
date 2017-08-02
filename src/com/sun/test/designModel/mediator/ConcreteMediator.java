package com.sun.test.designModel.mediator;

/**
 * Created by sunleic on 2017/8/2.
 */
public class ConcreteMediator extends Mediator {
    @Override
    public void doSomething1() {
        this.concreteColleague1.selfMethod1();
        this.concreteColleague2.selfMethod2();
    }

    @Override
    public void doSomething2() {
        super.concreteColleague1.selfMethod1();
        super.concreteColleague2.selfMethod2();
    }
}
