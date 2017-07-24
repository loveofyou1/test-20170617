package com.sun.test.designModel.strategy;

/**
 * 策略模式（Strategy Pattern）是一种比较简单的模式，也叫做政策模式（Policy
 * Pattern）。其定义如下：
 * Define a family of algorithms,encapsulate each one,and make them interchangeable.（定义一组
 * 算法，将每个算法都封装起来，并且使它们之间可以互换。）
 * <p>
 * 策略模式的三个角色：
 * ● Context封装角色
 * 它也叫做上下文角色，起承上启下封装作用，屏蔽高层模块对策略、算法的直接访问，
 * 封装可能存在的变化。
 * ● Strategy抽象策略角色
 * 策略、算法家族的抽象，通常为接口，定义每个策略或算法必须具有的方法和属性。各
 * 位看官可能要问了，类图中的AlgorithmInterface是什么意思，嘿嘿，algorithm是“运算法则”的
 * 意思，结合起来意思就明白了吧。
 * ● ConcreteStrategy具体策略角色
 * 实现抽象策略中的操作，该类含有具体的算法。
 * Created by sunleic on 2017/7/24.
 */
public class Client {
    public static void main(String args[]) {
        Strategy strategy = new ConcreteStrategy1();
        Context context = new Context(strategy);
        context.doAnything();
    }
}
