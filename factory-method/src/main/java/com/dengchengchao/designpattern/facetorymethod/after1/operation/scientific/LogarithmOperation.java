package com.dengchengchao.designpattern.facetorymethod.after1.operation.scientific;

import com.dengchengchao.designpattern.facetorymethod.after1.operation.Operation;

/**
 * @author dengchengchao
 * @date 2018/12/28 11:17
 */
public class LogarithmOperation extends Operation {
    @Override
    public double getResult() {
        return Math.log(op1) / Math.log(op2);
    }
}
