package com.sun.test.designModel.part_3.factoryAndStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 测试类
 * Created by sunleic on 2017/8/13.
 * Version by ${VERSION}
 */
public class Client {
    //模拟交易
    public static void main(String[] args) {
        //初始化一张IC卡
        Card card = initIC();
        //显示一下卡内信息
        System.out.println("========初始卡信息：=========");
        showCard(card);
        //是否停止运行标志
        boolean flag = true;
        while (flag) {
            Trade trade = createTrade();
            DeductionFacade.deduct(card, trade);
            //交易成功，打印出成功处理消息
            System.out.println("\n======交易凭证========");
            System.out.println(trade.getTradeNO() + " 交易成功！");
            System.out.println("本次发生的交易金额为：" +
                    trade.getTradeMoney() / 100.0 + "元");
            //展示一下卡内信息
            showCard(card);
            System.out.print("\n是否需要退出？(Y/N)");
            if (getInput().equalsIgnoreCase("y")) {
                flag = false; //退出
            }
        }
    }

    //初始化一个IC卡
    private static Card initIC() {
        Card card = new Card();
        card.setIcNo("1100010001000");
        card.setFreeMoney(100000); //1000元
        card.setSteadyMoney(80000); //800元
        return card;
    }

    //产生一条交易
    private static Trade createTrade() {
        Trade trade = new Trade();
        System.out.print("请输入交易编号：");
        trade.setTradeNO(getInput());
        System.out.print("请输入交易金额：");
        trade.setTradeMoney(Integer.parseInt(getInput()));
        //返回交易
        return trade;
    }

    //打印出当前卡内交易余额
    public static void showCard(Card card) {
        System.out.println("IC卡编号:" + card.getIcNo());
        System.out.println("固定类型余额：" + card.getSteadyMoney() / 100.0 + " 元");
        System.out.println("自由类型余额：" + card.getFreeMoney() / 100.0 + " 元");
    }

    //获得键盘输入
    public static String getInput() {
        String str = "";
        try {
            str = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        } catch (IOException e) {
            //异常处理
        }
        return str;
    }
}
