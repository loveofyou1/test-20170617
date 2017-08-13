package com.sun.test.designModel.part_3.factoryAndStrategy;

/**
 * Created by sunleic on 2017/8/13.
 * Version by ${VERSION}
 */
public class StrategyFactory {

    public static IDeduction getDeduction(StrategyMan strategyMan) {
        IDeduction deduction = null;

        try {
            deduction = (IDeduction) Class.forName(strategyMan.getValue()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return deduction;
    }
}
