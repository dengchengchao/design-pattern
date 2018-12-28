package com.dengchengchao.designpattern.facetorymethod.after1;

import com.dengchengchao.designpattern.facetorymethod.after1.operation.Operation;
import com.dengchengchao.designpattern.facetorymethod.before.OperationUtils;

/**
 * @author dengchengchao
 * @date 2018/12/28 11:30
 */
public class Main {
    public static void main(String[] args) {
        double op1 = 7;
        double op2 = 9;
        String model = "程序员";
        Operation operation=OperationFactory.getOperation(model,"<<",op1,op2);
        operation.getResult();
    }
}
