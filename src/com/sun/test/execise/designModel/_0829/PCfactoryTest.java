package com.sun.test.execise.designModel._0829;

/**
 * 工厂模式
 * Created by sunleic on 2017/8/29.
 * Version by ${VERSION}
 */
public class PCfactoryTest {
    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();

        IComputer dell = factory.createComputer(Dell.class);
        System.out.println(dell.getCpu());
        System.out.println(dell.getSystem());

        IComputer apple = factory.createComputer(Apple.class);
        System.out.println(apple.getSystem());
        System.out.println(apple.getCpu());
    }
}
