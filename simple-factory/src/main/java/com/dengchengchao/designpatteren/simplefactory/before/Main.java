package com.dengchengchao.designpatteren.simplefactory.before;

/**
 * @author dengchengchao
 * @date 2018/12/21 0:10
 */
public class Main {
    public static void main(String[] args) {
        double op1=7;
        double op2=9;
        double result= OperationUtils.getResult("+",op1,op2);
    }
}
