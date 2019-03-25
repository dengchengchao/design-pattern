package com.dengchengchao.designpattern.builderpattern.last;

/**
 * @author dengchengchao
 * @date 2019/2/25 19:40
 */
public class Main {

    public static void main(String[] args) {
        PeopleBuilder peopleBuilder=new FatPeopleBuilder();
        PeopleController peopleController=new PeopleController();
        People people= peopleController.create(peopleBuilder);
        people.show();
    }
}
