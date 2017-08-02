package com.sun.test.designModel.mediator;

/**
 * 中介者模式的定义为：Define an object that encapsulates how a set of objects
 * interact.Mediator promotes loose coupling by keeping objects from referring to each other
 * explicitly,and it lets you vary their interaction independently.（用一个中介对象封装一系列的对象
 * 交互，中介者使各对象不需要显示地相互作用，从而使其耦合松散，而且可以独立地改变它
 * 们之间的交互。）
 * <p>
 * ● Mediator 抽象中介者角色
 * 抽象中介者角色定义统一的接口，用于各同事角色之间的通信。
 * ● Concrete Mediator 具体中介者角色
 * 具体中介者角色通过协调各同事角色实现协作行为，因此它必须依赖于各个同事角色。
 * ● Colleague 同事角色
 * 每一个同事角色都知道中介者角色，而且与其他的同事角色通信的时候，一定要通过中
 * 介者角色协作。每个同事类的行为分为两种：一种是同事本身的行为，比如改变对象本身的
 * 状态，处理自己的行为等，这种行为叫做自发行为（Self-Method），与其他的同事类或中介
 * 者没有任何的依赖；第二种是必须依赖中介者才能完成的行为，叫做依赖方法（Dep-
 * Method）。
 * <p>
 * 使用场景：
 * ● 机场调度中心
 * ● MVC框架
 * ● 媒体网关
 * ● 中介服务
 * Created by sunleic on 2017/8/2.
 */
public abstract class Mediator {

    protected ConcreteColleague1 concreteColleague1;
    protected ConcreteColleague2 concreteColleague2;

    public ConcreteColleague1 getConcreteColleague1() {
        return concreteColleague1;
    }

    public void setConcreteColleague1(ConcreteColleague1 concreteColleague1) {
        this.concreteColleague1 = concreteColleague1;
    }

    public ConcreteColleague2 getConcreteColleague2() {
        return concreteColleague2;
    }

    public void setConcreteColleague2(ConcreteColleague2 concreteColleague2) {
        this.concreteColleague2 = concreteColleague2;
    }

    public abstract void doSomething1();

    public abstract void doSomething2();
}
