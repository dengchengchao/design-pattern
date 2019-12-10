package com.dengchengchao.designpattern.adapter;

/**
 * @author dengchengchao
 * @date 2019/8/12 14:43
 */
public class PlayerOne implements NBAPlayer {

    @Override
    public void englishOffensive() {
        System.out.println("go go go");
    }

    @Override
    public void englishDefensive() {
        System.out.println("no no no");
    }
}
