package com.sun.test.designModel.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 访问者模式（Visitor Pattern）是一个相对简单的模式，其定义如下：Represent an
 * operation to be performed on the elements of an object structure. Visitor lets you define a new
 * operation without changing the classes of the elements on which it operates. （封装一些作用于某种
 * 数据结构中的各元素的操作，它可以在不改变数据结构的前提下定义作用于这些元素的新的
 * 操作。）
 * <p>
 * <p>
 * 看了这个通用类图，大家可能要犯迷糊了，这里怎么有一个ObjectStruture类呢？你刚刚
 * 举的例子怎么就没有呢？真没有吗？我们不是定义了一个List了吗？它中间的元素是我们一
 * 个一个手动增加上去的，这就是一个ObjectStruture，我们来看这几个角色的职责。
 * ● Visitor——抽象访问者
 * 抽象类或者接口，声明访问者可以访问哪些元素，具体到程序中就是visit方法的参数定
 * 义哪些对象是可以被访问的。
 * ● ConcreteVisitor——具体访问者
 * 它影响访问者访问到一个类后该怎么干，要做什么事情。
 * ● Element——抽象元素
 * 接口或者抽象类，声明接受哪一类访问者访问，程序上是通过accept方法中的参数来定
 * 义的。
 * ● ConcreteElement——具体元素
 * 实现accept方法，通常是visitor.visit(this)，基本上都形成了一种模式了。
 * ● ObjectStruture——结构对象
 * 元素产生者，一般容纳在多个不同类、不同接口的容器，如List、Set、Map等，在项目
 * 中，一般很少抽象出这个角色。
 * <p>
 * 访问者模式的优点
 * ● 符合单一职责原则
 * 具体元素角色也就是Employee抽象类的两个子类负责数据的加载，而Visitor类则负责报
 * 表的展现，两个不同的职责非常明确地分离开来，各自演绎变化。
 * ● 优秀的扩展性
 * 由于职责分开，继续增加对数据的操作是非常快捷的，例如，现在要增加一份给大老板
 * 的报表，这份报表格式又有所不同，直接在Visitor中增加一个方法，传递数据后进行整理打
 * 印。
 * ● 灵活性非常高
 * <p>
 * 访问者模式的缺点
 * ● 具体元素对访问者公布细节
 * 访问者要访问一个类就必然要求这个类公布一些方法和数据，也就是说访问者关注了其
 * 他类的内部细节，这是迪米特法则所不建议的。
 * ● 具体元素变更比较困难
 * 具体元素角色的增加、删除、修改都是比较困难的，就上面那个例子，你想想，你要是
 * 想增加一个成员变量，如年龄age，Visitor就需要修改，如果Visitor是一个还好办，多个呢？
 * 业务逻辑再复杂点呢？
 * ● 违背了依赖倒置转原则
 * 访问者依赖的是具体元素，而不是抽象元素，这破坏了依赖倒置原则，特别是在面向对
 * 象的编程中，抛弃了对接口的依赖，而直接依赖实现类，扩展比较难。
 * Created by sunleic on 2017/7/31.
 */
public class Client {
    public static void main(String args[]) {
        IVisitor visitor = new Visitor();
        for (Employee emp : mockEmployee()) {
            emp.accept(visitor);
        }
    }

    public static List<Employee> mockEmployee() {

        List<Employee> employeesList = new ArrayList<>();

        //产生张三这个员工
        CommonEmployee zhangSan = new CommonEmployee();
        zhangSan.setJob("编写Java程序，绝对的蓝领、苦工加搬运工");
        zhangSan.setName("张三");
        zhangSan.setSalary(1800);
        zhangSan.setSex(Employee.MAN);
        employeesList.add(zhangSan);
        //产生李四这个员工
        CommonEmployee liSi = new CommonEmployee();
        liSi.setJob("页面美工，审美素质太不流行了！");
        liSi.setName("李四");
        liSi.setSalary(1900);
        liSi.setSex(Employee.WOMEN);
        employeesList.add(liSi);
        //再产生一个经理
        Manager wangWu = new Manager();
        wangWu.setName("王五");
        wangWu.setPerformance("基本上是负值，但是我会拍马屁呀");
        wangWu.setSalary(18750);
        wangWu.setSex(Employee.MAN);
        employeesList.add(wangWu);

        return employeesList;
    }

}
