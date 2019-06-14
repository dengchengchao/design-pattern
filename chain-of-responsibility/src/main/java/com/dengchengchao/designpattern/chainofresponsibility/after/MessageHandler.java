package com.dengchengchao.designpattern.chainofresponsibility.after;

/**
 * @author dengchengchao
 * @date 2019/6/14 10:56
 */
public abstract class MessageHandler {

    private MessageHandler nextHandler;

    protected abstract void handMessageInterval(String message);

    protected void handMessage(String topic, String message) {
        if (match(topic)) {
            handMessageInterval(message);
        } else if (nextHandler != null) {
            nextHandler.handMessage(topic,message);
        } else {
            throw new UnsupportedOperationException("无法处理的Topic");
        }
    }

    void setNextHandler(MessageHandler handler) {
        this.nextHandler = handler;
    }

    abstract boolean match(String topic);
}
