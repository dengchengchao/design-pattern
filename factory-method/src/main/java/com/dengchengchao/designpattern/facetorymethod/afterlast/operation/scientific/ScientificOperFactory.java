package com.dengchengchao.designpattern.facetorymethod.afterlast.operation.scientific;



import com.dengchengchao.designpattern.facetorymethod.afterlast.operation.Operation;
import com.dengchengchao.designpattern.facetorymethod.afterlast.operation.OperationFactory;


/**
 * @author dengchengchao
 * @date 2018/12/28 13:47
 */
public class ScientificOperFactory extends OperationFactory {
    @Override
    public Operation createOperation(String opera) {
        switch (opera) {
            case "^":
                return new PowerOperation();
            case "log":
                return new LogarithmOperation();
            case "√":
                return new RootOperation();
            default:
                throw new UnsupportedOperationException("不支持的操作符");
        }
    }
}
