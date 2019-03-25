package com.dengchengchao.designpattern.builderpattern.before;

/**
 * @author dengchengchao
 * @date 2019/2/25 10:30
 */
public class HandsomePeople {

    private String leg;

    private String head;

    private String hand;

    private String body;


    private   HandsomePeople(){

        leg="很长的腿";

        head="很帅气的头";

        hand = "很好看的手";

        body ="很强壮的身体";
    }

    public void show(){

        System.out.println(String.format("我有%s,%s,%s,%s",leg,head,hand,body));
    }
}
