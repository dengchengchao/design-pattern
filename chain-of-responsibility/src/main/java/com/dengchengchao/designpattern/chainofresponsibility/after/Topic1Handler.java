package com.dengchengchao.designpattern.chainofresponsibility.after;

/**
 * @author dengchengchao
 * @date 2019/6/14 11:03
 */
public class Topic1Handler extends MessageHandler{

    @Override
    protected void handMessageInterval(String message) {
        System.out.println("处理topic1消息");
    }

    @Override
    boolean match(String topic) {
        return "/topic/topic1/".equals(topic);
    }
}
