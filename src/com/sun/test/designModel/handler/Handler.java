package com.sun.test.designModel.handler;


/**
 * 责任链模式定义如下：
 * Avoid coupling the sender of a request to its receiver by giving more than one object a chance to
 * handle the request.Chain the receiving objects and pass the request along the chain until an object
 * handles it.（使多个对象都有机会处理请求，从而避免了请求的发送者和接受者之间的耦合关
 * 系。将这些对象连成一条链，并沿着这条链传递该请求，直到有对象处理它为止。）
 * 责任链模式的重点是在“链”上，由一条链去处理相似的请求在链中决定谁来处理这个请
 * 求，并返回相应的结果
 * Created by sunleic on 2017/7/26.
 */
public abstract class Handler {
    private Handler nextHandler;

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public final Response handleMessage(Request request) {
        Response response = null;
        //判断是否是自己的处理级别
        if (this.getHandlerLevel().equals(request.getRequestLevel())) {
            response = this.echo(request);
        } else { //不属于自己的处理级别
            //判断是否有下一个处理者
            if (this.nextHandler != null) {
                response = this.nextHandler.handleMessage(request);
            } else {
                //没有适当的处理者，业务自行处理
            }
        }
        return response;
    }

    //每个处理者都有一个处理级别
    protected abstract Level getHandlerLevel();

    //每个处理者都必须实现处理任务
    protected abstract Response echo(Request request);
}
