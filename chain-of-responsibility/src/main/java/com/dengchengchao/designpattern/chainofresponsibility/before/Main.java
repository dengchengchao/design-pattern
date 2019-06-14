package com.dengchengchao.designpattern.chainofresponsibility.before;

/**
 * @author dengchengchao
 * @date 2019/6/14 11:01
 */
public class Main {

    public static void main(String[] args) {
        MessageHandler messageHandler=MessageHandlerFactory.createMessageHandler("/topic/topic1/");
        messageHandler.handMessage("message");
    }
}
