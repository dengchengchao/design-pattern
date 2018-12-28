package com.dengchengchao.designpattern.facetorymethod.before;

import java.util.logging.Logger;

/**
 * @author dengchengchao
 * @date 2018/12/27 16:46
 */
public class OperationUtils {

    private  static Logger logger=Logger.getLogger("OperationUtils");

    public static double getResult(String mode, String opera, double op1, double op2) {

        switch (mode) {
            case "标准":
                return getStandardResult(opera, op1, op2);
            case "科学计算器":
                return getScientificResult(opera, op1, op2);
            case "程序员":
                return getComputerResult(opera, op1, op2);
            default:
                throw new UnsupportedOperationException("不支持的模式");
        }

    }


    private static double getStandardResult(String opera, double op1, double op2) {
        switch (opera) {
            case "+":
                return op1 + op2;
            case "-":
                return op1 - op2;
            case "*":
                return op1 * op2;
            default:
                throw new UnsupportedOperationException("不支持的操作符");
        }
    }


    private static double getScientificResult(String opera, double op1, double op2) {
        switch (opera) {
            case "√":
                return Math.pow(op1, 1 / op2);
            case "^":
                return Math.pow(op1, op2);
            case "log":
                return Math.log(op1) / Math.log(op2);
            default:
                throw new UnsupportedOperationException("不支持的操作符");

        }
    }

    private static double getComputerResult(String opera, double op1, double op2) {
        int intOp1 = (int) op1;
        int intOp2 = (int) op2;
        switch (opera) {
            case "<<":
                return intOp1 << intOp2;
            case ">>":
                return intOp1 >> intOp2;
            case "&":
                return intOp1 & intOp2;
            default:
                throw new UnsupportedOperationException("不支持的操作符");
        }
    }

}
