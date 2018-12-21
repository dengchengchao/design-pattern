package com.dengchengchao.designpatteren.simplefactory.after.operation;

/**
 * @author dengchengchao
 * @date 2018/12/21 16:33
 */
public class DivOperation extends Operation {
    @Override
    public double getResult() {
        return op1/op2;
    }

    public DivOperation(double op1,double op2){
        super(op1,op2);
    }
}
