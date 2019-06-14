package com.dengchengchao.designpattern.chainofresponsibility.before;

/**
 * @author dengchengchao
 * @date 2019/6/14 10:17
 */
public class Topic1Handler implements MessageHandler {
    @Override
    public void handMessage(String message) {
        System.out.println("处理test1消息");
    }
}
