package com.sun.test.designModel.interpreter;

import java.util.HashMap;

/**
 * Created by sunleic on 2017/8/2.
 */
public class VarExpression extends Expression {

    private String key;

    public VarExpression(String _key) {
        this.key = _key;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(key);
    }
}
