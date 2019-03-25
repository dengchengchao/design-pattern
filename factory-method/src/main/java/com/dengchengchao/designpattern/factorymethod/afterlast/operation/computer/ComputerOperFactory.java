package com.dengchengchao.designpattern.factorymethod.afterlast.operation.computer;


import com.dengchengchao.designpattern.factorymethod.afterlast.operation.Operation;
import com.dengchengchao.designpattern.factorymethod.afterlast.operation.OperationFactory;


/**
 * @author dengchengchao
 * @date 2018/12/28 13:45
 */
public class ComputerOperFactory extends OperationFactory {
    @Override
    public Operation createOperation(String opera) {
        switch (opera) {
            case "<<":
                return new MoveLeftOperation();
            case "&":
                return new AndOperation();
            case ">>":
                return new MoveRightOperation();
            default:
                throw new UnsupportedOperationException("不支持的操作符");
        }

    }
}
