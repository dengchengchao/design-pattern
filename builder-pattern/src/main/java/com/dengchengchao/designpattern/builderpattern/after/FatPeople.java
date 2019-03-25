package com.dengchengchao.designpattern.builderpattern.after;

/**
 * @author dengchengchao
 * @date 2019/2/25 10:35
 */
public class FatPeople  extends  People{

    @Override
    public void initLeg() {
        leg="很粗的腿";
    }

    @Override
    public void initHead() {
        head="很胖的头";
    }

    @Override
    public void initHand() {
        hand = "很胖的手";
    }

    @Override
    public void initBody() {
        body ="很圆的身体";
    }
}
