package com.dengchengchao.designpattern.builderpattern.last;

/**
 * @author dengchengchao
 * @date 2019/2/25 15:17
 */
public abstract class PeopleBuilder {

    protected   People people=new People();

    abstract void builderHead();

    abstract void builderHand();

    abstract void builderBody();

    abstract void builderLeg();

    People getPeople(){
        return  people;
    }
}
