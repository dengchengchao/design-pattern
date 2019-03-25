package com.dengchengchao.designpattern.factorymethod.after1.operation;

/**
 * @author dengchengchao
 * @date 2018/12/21 16:28
 */
public abstract class Operation {

    protected double op1;

    protected double op2;

    public void setOp1(double op1){
        this.op1=op1;
    }

    public void setOp2(double op2) {
        this.op2 = op2;
    }

    public abstract double getResult();
}
