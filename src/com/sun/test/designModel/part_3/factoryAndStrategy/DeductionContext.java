package com.sun.test.designModel.part_3.factoryAndStrategy;

/**
 * Created by sunleic on 2017/8/13.
 * Version by ${VERSION}
 */
public class DeductionContext {

    private IDeduction iDeduction = null;

    public DeductionContext(IDeduction iDeduction) {
        this.iDeduction = iDeduction;
    }

    public boolean exec(Card card, Trade trade) {
        return this.iDeduction.exec(card, trade);
    }
}
