package com.dengchengchao.designpattern.chainofresponsibility.after;

/**
 * @author dengchengchao
 * @date 2019/6/14 11:06
 */
public class Topic3Handler extends MessageHandler {

    @Override
    protected void handMessageInterval(String message) {
        System.out.println("处理Topic3消息");
    }

    @Override
    boolean match(String topic) {
        return "/topic/topic3/".equals(topic);
    }
}
