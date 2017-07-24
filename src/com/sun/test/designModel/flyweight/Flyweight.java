package com.sun.test.designModel.flyweight;

/**
 * 享元模式（Flyweight Pattern）是池技术的重要实现方式，其定义如下：Use sharing to
 * support large numbers of fine-grained objects efficiently.（使用共享对象可有效地支持大量的细
 * 粒度的对象。）
 * 享元模式的定义为我们提出了两个要求：细粒度的对象和共享对象。我们知道分配太多
 * 的对象到应用程序中将有损程序的性能，同时还容易造成内存溢出，那怎么避免呢？就是享
 * 元模式提到的共享技术。我们先来了解一下对象的内部状态和外部状态。
 * 要求细粒度对象，那么不可避免地使得对象数量多且性质相近，那我们就将这些对象的
 * 信息分为两个部分：内部状态（intrinsic）与外部状态（extrinsic）。
 * ● 内部状态
 * 内部状态是对象可共享出来的信息，存储在享元对象内部并且不会随环境改变而改变，
 * 如我们例子中的id、postAddress等，它们可以作为一个对象的动态附加信息，不必直接储存
 * 在具体某个对象中，属于可以共享的部分。
 * ● 外部状态
 * 外部状态是对象得以依赖的一个标记，是随环境改变而改变的、不可以共享的状态，如
 * 我们例子中的考试科目+考试地点复合字符串，它是一批对象的统一标识，是唯一的一个索
 * 引值。
 * 抽象享元角色一般为抽象类，在实际项目中，一般是一个实现类，它是描述一类事物的
 * 方法。在抽象角色中，一般需要把外部状态和内部状态（当然了，可以没有内部状态，只有
 * 行为也是可以的）定义出来，避免子类的随意扩展
 * Created by sunleic on 2017/7/24.
 */
public abstract class Flyweight {
    //内部状态
    private String intrinsic;
    //外部状态
    protected final String Extrinsic;

    //要求享元角色必须接受外部状态
    public Flyweight(String extrinsic) {
        Extrinsic = extrinsic;
    }

    //定义业务操作
    public abstract void operate();

    public String getIntrinsic() {
        return intrinsic;
    }

    public void SetIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }

}
