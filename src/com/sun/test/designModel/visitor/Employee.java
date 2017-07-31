package com.sun.test.designModel.visitor;

/**
 * Created by sunleic on 2017/7/31.
 */
public abstract class Employee {
    public final static int MAN = 0;
    public final static int WOMEN = 1;
    private String name;
    private int salary;
    private int sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public abstract void accept(IVisitor iVisitor);
}
