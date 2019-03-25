package com.dengchengchao.designpattern.strategy.after;

/**
 * @author dengchengchao
 * @date 2019/3/25 18:20
 */
public class StrategyByDiscount extends AbstractStrategy {

    private double disCount;

    @Override
    public double getPriceAfterDiscount() {
        return disCount*price;
    }

    public  StrategyByDiscount(double disCount){
        this.disCount=disCount;
    }
}
