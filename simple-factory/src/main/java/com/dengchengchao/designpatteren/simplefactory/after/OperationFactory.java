package com.dengchengchao.designpatteren.simplefactory.after;

import com.dengchengchao.designpatteren.simplefactory.after.operation.*;

/**
 * @author dengchengchao
 * @date 2018/12/21 16:34
 */
public class OperationFactory {

    public static Operation getOperation(String operation, double op1, double op2) {
        switch (operation) {
            case "+":
                return new AddOperation(op1, op2);
            case "-":
                return new SubOperation(op1, op2);
            case "*":
                return new MulOperation(op1, op2);
            case "/":
                return new DivOperation(op1, op2);
            default:
                throw new UnsupportedOperationException("不支持的操作");
        }

    }
}
