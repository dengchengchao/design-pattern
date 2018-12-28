package com.dengchengchao.designpattern.facetorymethod.before;

/**
 * @author dengchengchao
 * @date 2018/12/28 9:38
 */
public class Main {

    public static void main(String[] args) {
        double op1=7;
        double op2=9;
        String model="程序员";
        OperationUtils.getResult(model,"<<",op1,op2);
    }
}
