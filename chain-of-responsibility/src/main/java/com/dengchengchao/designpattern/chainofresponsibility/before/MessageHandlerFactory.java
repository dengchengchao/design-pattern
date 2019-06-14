package com.dengchengchao.designpattern.chainofresponsibility.before;

/**
 * @author dengchengchao
 * @date 2019/6/14 10:16
 */
public class MessageHandlerFactory {

    private static Topic1Handler topic1Handler = new Topic1Handler();

    private static Topic2Handler topic2Handler = new Topic2Handler();

    private static Topic3Handler topic3Handler = new Topic3Handler();


    public static MessageHandler createMessageHandler(String topic) {
        switch (topic) {
            case "/topic/topic1/":
                return topic1Handler;
            case "/topic/topic2/":
                return topic2Handler;
            case "/topic/topic3/":
                return topic3Handler;
            default:
                throw new UnsupportedOperationException("无法处理的topic");
        }
    }
}
