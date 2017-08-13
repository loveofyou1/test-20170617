package com.sun.test.designModel.part_3.factoryAndStrategy;

/**
 * ic卡片
 * Created by sunleic on 2017/8/13.
 * Version by ${VERSION}
 */
public class Card {
    //卡片编号
    private String icNo = "";
    //固定金额
    private int steadyMoney = 0;
    //自由金额
    private int freeMoney = 0;

    public String getIcNo() {
        return icNo;
    }

    public void setIcNo(String icNo) {
        this.icNo = icNo;
    }

    public int getSteadyMoney() {
        return steadyMoney;
    }

    public void setSteadyMoney(int steadyMoney) {
        this.steadyMoney = steadyMoney;
    }

    public int getFreeMoney() {
        return freeMoney;
    }

    public void setFreeMoney(int freeMoney) {
        this.freeMoney = freeMoney;
    }
}
