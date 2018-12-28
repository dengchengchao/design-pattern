package com.dengchengchao.designpattern.facetorymethod.after1.operation.computer;

import com.dengchengchao.designpattern.facetorymethod.after1.operation.Operation;

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
