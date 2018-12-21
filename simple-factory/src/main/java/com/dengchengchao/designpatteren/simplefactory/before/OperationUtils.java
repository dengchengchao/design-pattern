package com.dengchengchao.designpatteren.simplefactory.before;

/**
 * @author dengchengchao
 * @date 2018/12/21 0:08
 */
public class OperationUtils {

    public static double getResult(String operation, double op1, double op2) {
        switch (operation) {
            case "+":
                return op1 + op2;
            case "-":
                return op1 - op2;
            case "x":
                return op1 * op2;
            case "/":
                return op1 / op2;
            default:
                throw new UnsupportedOperationException("不支持的操作符");
        }
    }
}
