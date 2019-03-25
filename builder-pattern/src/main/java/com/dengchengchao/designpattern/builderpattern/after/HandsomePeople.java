package com.dengchengchao.designpattern.builderpattern.after;

/**
 * @author dengchengchao
 * @date 2019/2/25 10:39
 */
public class HandsomePeople extends  People {

    @Override
    public void initLeg() {
        leg="很长的腿";
    }

    @Override
    public void initHead() {
        head="很帅气的头";
    }

    @Override
    public void initHand() {
        hand = "很好看的手";
    }

    @Override
    public void initBody() {
        body ="很强壮的身体";
    }
}
