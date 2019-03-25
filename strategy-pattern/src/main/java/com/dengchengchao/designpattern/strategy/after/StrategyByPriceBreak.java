package com.dengchengchao.designpattern.strategy.after;

/**
 * @author dengchengchao
 * @date 2019/3/25 18:22
 */
public class StrategyByPriceBreak extends AbstractStrategy{

    private  double limit;

    private  double reduce;

    public void setLimit(double limit){
        this.limit=limit;
    }

    public  void setReduce(double reduce){
        this.reduce=reduce;
    }

    @Override
    public double getPriceAfterDiscount() {
        return price-((price/limit)*reduce);
    }

    public  StrategyByPriceBreak(double limit,double reduce){
        this.limit=limit;
        this.reduce=reduce;
    }
}
