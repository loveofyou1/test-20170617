package com.sun.test.designModel.visitor;

/**
 * Created by sunleic on 2017/7/31.
 */
public class CommonEmployee extends Employee {

    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void accept(IVisitor iVisitor) {
        iVisitor.visit(this);
    }
}
