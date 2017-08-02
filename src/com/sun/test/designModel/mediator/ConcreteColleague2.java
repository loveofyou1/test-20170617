package com.sun.test.designModel.mediator;

/**
 * Created by sunleic on 2017/8/2.
 */
public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void selfMethod2() {
        //do Something
    }

    public void dependMethod2(){
        //do Something
        this.mediator.doSomething2();
    }
}
