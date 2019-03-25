package com.dengchengchao.designpattern.factorymethod.afterlast.operation.standard;


import com.dengchengchao.designpattern.factorymethod.afterlast.operation.Operation;
import com.dengchengchao.designpattern.factorymethod.afterlast.operation.OperationFactory;

/**
 * @author dengchengchao
 * @date 2018/12/28 13:50
 */
public class StandardOperaFactory extends OperationFactory {
    @Override
    public Operation createOperation(String opera) {
        switch (opera) {
            case "-":
                return new SubOperation();
            case "*":
                return new MulOperation();
            case "+":
                return new AddOperation();
            default:
                throw new UnsupportedOperationException("不支持的操作符");
        }
    }
}
