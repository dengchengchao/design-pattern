package com.dengchengchao.designpattern.builderpattern.last;

/**
 * @author dengchengchao
 * @date 2019/2/25 19:27
 */
public class HandsomePeopleBuilder extends PeopleBuilder {
    @Override
    void builderHead() {
        people.setHead("帅气的头");
    }

    @Override
    void builderHand() {
        people.setHand("帅气的手");
    }

    @Override
    void builderBody() {
        people.setBody("强壮的身体");
    }

    @Override
    void builderLeg() {
        people.setLeg("很长的腿 ");
    }
}
