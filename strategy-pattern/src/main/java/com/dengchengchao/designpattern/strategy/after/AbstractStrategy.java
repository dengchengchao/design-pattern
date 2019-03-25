package com.dengchengchao.designpattern.strategy.after;

/**
 * @author dengchengchao
 * @date 2019/3/25 18:18
 */
public abstract class AbstractStrategy implements Strategy {

    protected double price;

    public  void setPrice(double price){
        this.price=price;
    }

    public abstract double getPriceAfterDiscount();
}
