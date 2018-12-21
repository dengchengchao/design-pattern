package com.dengchengchao.designpatteren.simplefactory.after.operation;

/**
 * @author dengchengchao
 * @date 2018/12/21 16:31
 */
public class SubOperation extends Operation{

    @Override
    public double getResult() {
        return op1-op2;
    }

    public SubOperation(double op1,double op2){
        super(op1,op2);
    }
}
