package com.dengchengchao.designpattern.factorymethod.afterlast.operation.computer;

import com.dengchengchao.designpattern.factorymethod.afterlast.operation.Operation;

/**
 * @author dengchengchao
 * @date 2018/12/28 11:18
 */
public class MoveRightOperation  extends Operation {
    @Override
    public double getResult() {

        return (int)op1>>(int)op2;
    }
}
