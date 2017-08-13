package com.sun.test.designModel.part_3.factoryAndStrategy;

/**
 * Created by sunleic on 2017/8/13.
 * Version by ${VERSION}
 */
public interface IDeduction {
    //扣款，提供交易和卡信息，进行扣款，并返回扣款是否成功
    public boolean exec(Card card, Trade trade);

}
