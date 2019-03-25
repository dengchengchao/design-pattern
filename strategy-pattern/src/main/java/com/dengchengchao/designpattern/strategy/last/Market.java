package com.dengchengchao.designpattern.strategy.last;

import com.dengchengchao.designpattern.strategy.after.Strategy;

import java.util.Date;

/**
 * @author dengchengchao
 * @date 2019/3/25 19:54
 */
public class Market {

    private Strategy strategy;

    public  Market(Strategy strategy){
        this.strategy=strategy;
    }


    public  double getTotalPrice(){
        return strategy.getPriceAfterDiscount();
    }

    public  double getSingleGoodsPrice(String key){
        //...获取单个商品信息
        return 0;
    }

    public Date getAcquisitionDate(String key){
        //...获取商品生产日期
        return null;
    }


}
