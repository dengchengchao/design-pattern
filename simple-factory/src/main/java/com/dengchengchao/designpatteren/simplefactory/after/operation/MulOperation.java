package com.dengchengchao.designpatteren.simplefactory.after.operation;

/**
 * @author dengchengchao
 * @date 2018/12/21 16:32
 */
public class MulOperation extends Operation {
    @Override
    public double getResult() {
        return op1*op2;
    }

    public MulOperation(double op1,double op2){
        super(op1,op2);
    }
}
