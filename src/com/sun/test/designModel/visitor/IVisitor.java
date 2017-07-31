package com.sun.test.designModel.visitor;

/**
 * Created by sunleic on 2017/7/31.
 */
public interface IVisitor {
    public void visit(CommonEmployee commonEmployee);

    public void visit(Manager manager);
}
