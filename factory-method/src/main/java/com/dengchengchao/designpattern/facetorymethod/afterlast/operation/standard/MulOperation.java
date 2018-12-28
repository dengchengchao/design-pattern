package com.dengchengchao.designpattern.facetorymethod.afterlast.operation.standard;

import com.dengchengchao.designpattern.facetorymethod.afterlast.operation.Operation;

/**
 * @author dengchengchao
 * @date 2018/12/21 16:32
 */
public class MulOperation extends Operation {
    @Override
    public double getResult() {
        return op1*op2;
    }


}
