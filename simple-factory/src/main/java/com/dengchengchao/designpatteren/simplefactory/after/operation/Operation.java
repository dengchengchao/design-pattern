package com.dengchengchao.designpatteren.simplefactory.after.operation;

/**
 * @author dengchengchao
 * @date 2018/12/21 16:28
 */
public abstract class Operation {

    double op1;

    double op2;

    public Operation(double op1, double op2) {
        this.op1 = op1;
        this.op2 = op2;
    }

    public abstract double getResult();
}
