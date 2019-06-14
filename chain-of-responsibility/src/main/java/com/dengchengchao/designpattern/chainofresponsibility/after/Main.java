package com.dengchengchao.designpattern.chainofresponsibility.after;

/**
 * @author dengchengchao
 * @date 2019/6/14 11:06
 */
public class Main {

    public static void main(String[] args) {
        Topic1Handler topic1Handler=new Topic1Handler();
        Topic2Handler topic2Handler=new Topic2Handler();
        Topic3Handler topic3Handler=new Topic3Handler();

        topic1Handler.setNextHandler(topic2Handler);
        topic2Handler.setNextHandler(topic3Handler);


        topic1Handler.handMessage("/topic/topic1/","message");

    }
}
