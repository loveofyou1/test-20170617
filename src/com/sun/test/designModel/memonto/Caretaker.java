package com.sun.test.designModel.memonto;

/**
 * 备忘录管理员角色
 * 对备忘录进行管理、保存和提供备忘录。
 * Created by sunleic on 2017/7/28.
 */
public class Caretaker {
    //备忘录对象
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
