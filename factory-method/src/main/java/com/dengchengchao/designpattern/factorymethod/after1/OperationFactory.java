package com.dengchengchao.designpattern.factorymethod.after1;

import com.dengchengchao.designpattern.factorymethod.after1.operation.Operation;
import com.dengchengchao.designpattern.factorymethod.after1.operation.computer.AndOperation;
import com.dengchengchao.designpattern.factorymethod.after1.operation.computer.MoveLeftOperation;
import com.dengchengchao.designpattern.factorymethod.after1.operation.computer.MoveRightOperation;
import com.dengchengchao.designpattern.factorymethod.after1.operation.scientific.LogarithmOperation;
import com.dengchengchao.designpattern.factorymethod.after1.operation.scientific.PowerOperation;
import com.dengchengchao.designpattern.factorymethod.after1.operation.scientific.RootOperation;
import com.dengchengchao.designpattern.factorymethod.after1.operation.standard.AddOperation;
import com.dengchengchao.designpattern.factorymethod.after1.operation.standard.MulOperation;
import com.dengchengchao.designpattern.factorymethod.after1.operation.standard.SubOperation;

/**
 * @author dengchengchao
 * @date 2018/12/21 16:34
 */
public class OperationFactory {

    public static Operation getOperation(String model, String opera, double op1, double op2) {
        Operation operation;
        switch (model) {
            case "标准":
                operation = getStandardResult(opera);
                break;
            case "科学计算器":
                operation = getScientificResult(opera);
                break;
            case "程序员":
                operation = getComputerResult(opera);
                break;
            default:
                throw new UnsupportedOperationException("不支持的操作符");
        }
        operation.setOp1(op1);
        operation.setOp2(op2);
        return operation;
    }

    private static Operation getStandardResult(String opera) {
        switch (opera) {
            case "+":
                return new AddOperation();
            case "-":
                return new SubOperation();
            case "*":
                return new MulOperation();
            default:
                throw new UnsupportedOperationException("不支持的操作符");
        }
    }


    private static Operation getScientificResult(String opera) {
        switch (opera) {
            case "√":
                return new RootOperation();
            case "^":
                return new PowerOperation();
            case "log":
                return new LogarithmOperation();
            default:
                throw new UnsupportedOperationException("不支持的操作符");

        }
    }

    private static Operation getComputerResult(String opera) {

        switch (opera) {
            case "<<":
                return new MoveLeftOperation();
            case ">>":
                return new MoveRightOperation();
            case "&":
                return new AndOperation();
            default:
                throw new UnsupportedOperationException("不支持的操作符");
        }
    }
}
