package com.dengchengchao.designpattern.builderpattern.last;

/**
 * @author dengchengchao
 * @date 2019/2/25 18:51
 */
public class FatPeopleBuilder extends PeopleBuilder {

    @Override
    public void builderHead() {
        people.setHead("很胖的头");
    }

    @Override
    public void builderHand() {
      people.setHand("很胖的手");
    }

    @Override
    public void builderBody() {
        people.setBody("很圆的身体");
    }

    @Override
    public void builderLeg() {
        people.setLeg("很粗的腿");
    }

}
