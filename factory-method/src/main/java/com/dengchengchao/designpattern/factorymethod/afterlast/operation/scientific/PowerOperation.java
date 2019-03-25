package com.dengchengchao.designpattern.factorymethod.afterlast.operation.scientific;

import com.dengchengchao.designpattern.factorymethod.afterlast.operation.Operation;

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
