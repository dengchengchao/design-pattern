package com.dengchengchao.designpattern.facetorymethod.afterlast;

import com.dengchengchao.designpattern.facetorymethod.afterlast.operation.Operation;
import com.dengchengchao.designpattern.facetorymethod.afterlast.operation.OperationFactory;
import com.dengchengchao.designpattern.facetorymethod.afterlast.operation.standard.StandardOperaFactory;

/**
 * @author dengchengchao
 * @date 2018/12/28 13:51
 */
public class Main {

    public static void main(String[] args) {

        double op1 = 7;
        double op2 = 9;

        OperationFactory factory =new StandardOperaFactory();
        Operation operation=factory.getOperation("+",op1,op2);
        System.out.println(operation.getResult());
    }
}
