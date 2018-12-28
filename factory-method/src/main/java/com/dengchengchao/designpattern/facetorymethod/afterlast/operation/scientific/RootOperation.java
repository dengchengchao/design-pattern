package com.dengchengchao.designpattern.facetorymethod.afterlast.operation.scientific;

import com.dengchengchao.designpattern.facetorymethod.afterlast.operation.Operation;

/**
 * @author dengchengchao
 * @date 2018/12/28 11:13
 */
public class RootOperation extends Operation {

    @Override
    public double getResult() {
        return Math.pow(op1, 1 / op2);
    }
}
