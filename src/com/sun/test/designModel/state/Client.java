package com.sun.test.designModel.state;

/**
 * 什么是状态模式呢？其定义如下：
 * Allow an object to alter its behavior when its internal state changes.The object will appear to
 * change its class.（当一个对象内在状态改变时允许其改变行为，这个对象看起来像改变了其类。）
 * <p>
 * 状态模式的核心是封装，状态的变更引起了行为的变更，从外部看起来就好像这个对象
 * 对应的类发生了改变一样。
 * 我们先来看看状态模式中的3个角色。
 * ● State——抽象状态角色
 * 接口或抽象类，负责对象状态定义，并且封装环境角色以实现状态切换。
 * ● ConcreteState——具体状态角色
 * 每一个具体状态必须完成两个职责：本状态的行为管理以及趋向状态处理，通俗地说，
 * 就是本状态下要做的事情，以及本状态如何过渡到其他状态。
 * ● Context——环境角色
 * 定义客户端需要的接口，并且负责具体状态的切换。
 * 状态模式相对来说比较复杂，它提供了一种对物质运动的另一个观察视角，通过状态变
 * 更促使行为的变化，就类似水的状态变更一样，一碗水的初始状态是液态，通过加热转变为
 * 气态，状态的改变同时也引起体积的扩大，然后就产生了一个新的行为：鸣笛或顶起壶盖，
 * 瓦特就是这么发明蒸汽机的。
 * Created by sunleic on 2017/7/29.
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new ClosingState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
