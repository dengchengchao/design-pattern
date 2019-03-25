package com.dengchengchao.designpattern.factorymethod.afterlast.operation;

/**
 * @author dengchengchao
 * @date 2018/12/28 13:44
 */
public abstract class OperationFactory {

    public Operation getOperation(String opera, double op1, double op2) {
        Operation operation = createOperation(opera);
        operation.setOp1(op1);
        operation.setOp2(op2);
        return operation;
    }

    protected abstract Operation createOperation(String opera);
}
