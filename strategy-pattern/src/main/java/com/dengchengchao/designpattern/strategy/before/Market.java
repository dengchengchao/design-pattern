package com.dengchengchao.designpattern.strategy.before;


import lombok.Setter;

/**
 * @author dengchengchao
 * @date 2019/3/25 17:53
 */

@Setter
public class Market {

    private double price;

    private double discount=1;

    public double getPriceAfterDiscount() {
        return price * discount;
    }
}
