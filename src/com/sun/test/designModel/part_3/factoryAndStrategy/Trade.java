package com.sun.test.designModel.part_3.factoryAndStrategy;

/**
 * Created by sunleic on 2017/8/13.
 * Version by ${VERSION}
 */
public class Trade {
    //交易编号
    private String tradeNO = "";

    //交易金额
    private int tradeMoney = 0;

    public String getTradeNO() {
        return tradeNO;
    }

    public void setTradeNO(String tradeNO) {
        this.tradeNO = tradeNO;
    }

    public int getTradeMoney() {
        return tradeMoney;
    }

    public void setTradeMoney(int tradeMoney) {
        this.tradeMoney = tradeMoney;
    }
}
