package com.dengchengchao.designpattern.builderpattern.last;


import lombok.Getter;
import lombok.Setter;

/**
 * @author dengchengchao
 * @date 2019/2/25 15:16
 */
@Getter
@Setter
public class People {

    private String leg;

    private String head;

    private String hand;

    private String body;



    public  void show() {
        System.out.println(String.format("我有%s,%s,%s,%s", leg, head, hand, body));
    }


}