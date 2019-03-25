package com.dengchengchao.designpattern.builderpattern.after;

/**
 * @author dengchengchao
 * @date 2019/2/25 10:38
 */
public class ThinPeople extends People {

    @Override
    public void initLeg() {
        leg="很瘦的腿";
    }

    @Override
    public void initHead() {
        head="很小的头";
    }

    @Override
    public void initHand() {
        hand = "很小的手";
    }

    @Override
    public void initBody() {
        body ="很小的身体";
    }

}
