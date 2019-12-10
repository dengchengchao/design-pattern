package com.dengchengchao.designpattern.adapter;

/**
 * @author dengchengchao
 * @date 2019/8/12 14:45
 */
public class NBAPlayerAdapter implements NBAPlayer {

    private final YaoMing yaoMing;

    public NBAPlayerAdapter(YaoMing yaoMing) {
        this.yaoMing = yaoMing;
    }

    @Override
    public void englishOffensive() {
        yaoMing.chineseOffensive();
    }

    @Override
    public void englishDefensive() {
        yaoMing.chineseDefensive();
    }
}
