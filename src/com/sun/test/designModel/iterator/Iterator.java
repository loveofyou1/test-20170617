package com.sun.test.designModel.iterator;

/**
 * Created by sunleic on 2017/7/26.
 */
public interface Iterator {
    //遍历到下一个元素
    public Object next();

    //是否遍历到了尾部
    public boolean hasNext();

    //删除当前指向的元素
    public boolean remove();
}
