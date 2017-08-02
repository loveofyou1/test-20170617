package com.sun.test.designModel.interpreter;

import java.util.HashMap;

/**
 * Created by sunleic on 2017/8/2.
 */
public class AddExpression extends SymbolExpression {
    AddExpression(Expression _left, Expression _right) {
        super(_left, _right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
