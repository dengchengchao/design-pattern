package com.dengchengchao.designpattern.builderpattern.last;

/**
 * @author dengchengchao
 * @date 2019/2/25 19:33
 */
public class PeopleController {

    public People create(PeopleBuilder builder) {
        builder.builderBody();
        builder.builderHand();
        builder.builderHead();
        builder.builderLeg();
        return builder.getPeople();
    }
}
