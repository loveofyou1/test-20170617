package com.sun.test.designModel.sixModelRule.openClose;

/**
 * 实现类
 * Created by sunleic on 2017/8/11.
 * Version by ${VERSION}
 */
public class NovelBook implements IBook {

    private String name;

    private int price;

    private String author;

    public NovelBook(String _name, int _price, String _author) {
        this.name = _name;
        this.price = _price;
        this.author = _author;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }
}
