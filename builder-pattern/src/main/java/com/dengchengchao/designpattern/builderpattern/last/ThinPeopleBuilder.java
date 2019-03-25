package com.dengchengchao.designpattern.builderpattern.last;

/**
 * @author dengchengchao
 * @date 2019/2/25 19:19
 */
public class ThinPeopleBuilder extends PeopleBuilder {

    @Override
    void builderHead() {
        people.setHead("很小的头");
    }

    @Override
    void builderHand() {
        people.setHand("很小的手");
    }

    @Override
    void builderBody() {
        people.setBody("很小的身体");
    }

    @Override
    void builderLeg() {
        people.setLeg("很瘦的腿");
    }
}


