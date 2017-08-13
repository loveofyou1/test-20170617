package com.sun.test.designModel.part_3.factoryAndStrategy;

/**
 * Created by sunleic on 2017/8/13.
 * Version by ${VERSION}
 */
public class FreeDeduction implements IDeduction {
    @Override
    public boolean exec(Card card, Trade trade) {
        card.setFreeMoney(card.getFreeMoney() - trade.getTradeMoney());
        return true;
    }
}
