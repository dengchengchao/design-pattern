package com.dengchengchao.designpattern.builderpattern.before;

/**
 * @author dengchengchao
 * @date 2019/2/25 10:23
 */
public class ThinPeople {

    private String leg;

    private String head;

    private String hand;

    private String body;


    private   ThinPeople(){

        leg="很瘦的腿";

        head="很小的头";

        hand = "很小的手";

        body ="很小的身体";
    }


    public void show(){

        System.out.println(String.format("我有%s,%s,%s,%s",leg,head,hand,body));
    }


}
