package com.sun.test.designModel.sixModelRule.openClose;

/**
 * 扩展类
 * Created by sunleic on 2017/8/11.
 * Version by ${VERSION}
 */
public class OffNovelBook extends NovelBook {
    public OffNovelBook(String _name, int _price, String _author) {
        super(_name, _price, _author);
    }

    @Override
    public int getPrice() {

        //原价
        int selfPrice = super.getPrice();
        int offPrice = 0;

        if (selfPrice > 4000) {//原价大于4000
            offPrice = selfPrice * 90 / 100;
        } else {
            offPrice = selfPrice * 80 / 100;
        }
        return offPrice;
    }
}
