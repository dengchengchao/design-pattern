package com.dengchengchao.designpatteren.simplefactory.after;

import com.dengchengchao.designpatteren.simplefactory.after.operation.Operation;

/**
 * @author dengchengchao
 * @date 2018/12/21 16:41
 */
public class Main {

    public static void main(String[] args) {
        double op1=7;
        double op2=9;
        Operation operation= OperationFactory.getOperation("+",op1,op2);
        double result = operation.getResult();
    }
}
