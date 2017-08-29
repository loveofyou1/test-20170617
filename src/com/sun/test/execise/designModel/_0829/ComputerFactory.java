package com.sun.test.execise.designModel._0829;

/**
 * Created by sunleic on 2017/8/29.
 * Version by ${VERSION}
 */
public class ComputerFactory extends AbstractComputerFactory {

    @Override
    public IComputer createComputer(Class c) {
        //抽象计算机类
        IComputer retComputer = null;
        try {
            retComputer = (IComputer) Class.forName(c.getName()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return retComputer;
    }
}
