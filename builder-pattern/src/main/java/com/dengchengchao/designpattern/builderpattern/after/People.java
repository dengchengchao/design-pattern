package com.dengchengchao.designpattern.builderpattern.after;

/**
 * @author dengchengchao
 * @date 2019/2/25 10:34
 */
public abstract class People {

    protected String leg;

    protected String head;

    protected String hand;

    protected String body;


    public abstract void initLeg();

    public abstract void initHead();

    public abstract void initHand();

    public abstract void initBody();

    protected People(){

    }

    public final void show() {
        initLeg();
        initHead();
        initHand();
        initBody();
        System.out.println(String.format("我有%s,%s,%s,%s", leg, head, hand, body));
    }


}
