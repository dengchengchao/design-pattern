package com.dengchengchao.designpattern.facetorymethod.after1.operation.scientific;

import com.dengchengchao.designpattern.facetorymethod.after1.operation.Operation;

/**
 * @author dengchengchao
 * @date 2018/12/28 11:16
 */
public class PowerOperation extends Operation {

    @Override
    public double getResult() {
        return Math.pow(op1, op2);
    }
}
