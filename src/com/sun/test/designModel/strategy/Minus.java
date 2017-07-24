package com.sun.test.designModel.strategy;

/**
 * Created by sunleic on 2017/7/24.
 */
public class Minus extends AbstractCalculator implements ICalculator{
    @Override
    public int calculate(String exp) {
        int[] arrayint = split(exp,"\\-");
        return arrayint[0] - arrayint[1];
    }
}
