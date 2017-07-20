package com.sun.test.designModel.composit;

/**
 * Created by sunleic on 2017/7/20.
 */
public class Client {
    public static void main(String args[]) {
        /**创建一个根节点*/
        Composite root = new Composite();
        root.doSomething();

        /**创建一个树枝构建*/
        Composite branch = new Composite();

        /**创建叶子节点*/
        Leaf leaf = new Leaf();

        /**简历整体*/
        root.add(branch);
        branch.add(leaf);
    }

    /**
     * 通过递归遍历
     */
    public static void display(Composite root) {
        for (Component composite : root.getComponentList()) {
            if (composite instanceof Leaf) {
                composite.doSomething();
            } else {//树枝节点
                display((Composite) composite);
            }
        }
    }
}
