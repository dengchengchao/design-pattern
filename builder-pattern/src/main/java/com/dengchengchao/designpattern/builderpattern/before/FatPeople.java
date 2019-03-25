package com.dengchengchao.designpattern.builderpattern.before;

/**
 * @author dengchengchao
 * @date 2019/2/25 10:28
 */
public class FatPeople {


        private String leg;

        private String head;

        private String hand;

        private String body;


        private   FatPeople(){

            leg="很粗的腿";

            head="很胖的头";

            hand = "很胖的手";

            body ="很圆的身体";
        }



        public void show(){

            System.out.println(String.format("我有%s,%s,%s,%s",leg,head,hand,body));
        }



}
