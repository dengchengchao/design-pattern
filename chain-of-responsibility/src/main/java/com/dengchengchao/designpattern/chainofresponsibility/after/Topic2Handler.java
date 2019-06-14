package com.dengchengchao.designpattern.chainofresponsibility.after;

/**
 * @author dengchengchao
 * @date 2019/6/14 11:04
 */
public class Topic2Handler extends MessageHandler {
    @Override
    protected void handMessageInterval(String message) {
        System.out.println("处理Topic2消息");
    }

    @Override
    boolean match(String topic) {
        return "/topic/topic2/".equals(topic);
    }
}
