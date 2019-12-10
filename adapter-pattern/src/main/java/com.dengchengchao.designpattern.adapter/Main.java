package com.dengchengchao.designpattern.adapter;

/**
 * @author dengchengchao
 * @date 2019/8/12 14:43
 */
public class Main {
    public static void main(String[] args) {
//        NBAPlayer nbaPlayer=new PlayerOne();
//        YaoMing yaoMing = new YaoMing();
//
//        nbaPlayer.englishDefensive();
//        yaoMing.chineseOffensive();

        YaoMing yaoMing=new YaoMing();

        NBAPlayer nbaPlayer=new NBAPlayerAdapter(yaoMing);
        nbaPlayer.englishDefensive();
    }
}
