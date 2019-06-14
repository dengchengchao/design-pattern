package com.dengchengchao.designpattern.chainofresponsibility.before;

/**
 * @author dengchengchao
 * @date 2019/6/14 10:19
 */
public class Topic2Handler implements MessageHandler {

    @Override
    public void handMessage(String message) {
        System.out.println("处理Test2消息");
    }
}
