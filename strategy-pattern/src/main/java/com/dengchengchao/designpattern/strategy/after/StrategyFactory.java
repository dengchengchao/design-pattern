package com.dengchengchao.designpattern.strategy.after;

/**
 * @author dengchengchao
 * @date 2019/3/25 18:24
 */
public class StrategyFactory {

    public static Strategy createStrategy(double price, String strategyStr) {
        Strategy strategy = null;
        switch (strategyStr) {
            case "打八折":
                strategy = new StrategyByDiscount(0.8);
                break;
            case "打九折":
                strategy = new StrategyByDiscount(0.9);
                break;
            case "每满100减20":
                strategy = new StrategyByPriceBreak(100, 20);
                break;
            default:
                strategy = new StrategyByDiscount(1);
        }

        strategy.setPrice(price);

        return  strategy;
    }

}
