package com.dengchengchao.designpattern.facetorymethod.afterlast.operation.computer;

import com.dengchengchao.designpattern.facetorymethod.afterlast.operation.Operation;

/**
 * @author dengchengchao
 * @date 2018/12/28 11:19
 */
public class AndOperation extends Operation {
    @Override
    public double getResult() {
        return (int)op1&(int)op2;
    }
}
