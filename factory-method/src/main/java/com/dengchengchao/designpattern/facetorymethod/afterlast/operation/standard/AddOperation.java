package com.dengchengchao.designpattern.facetorymethod.afterlast.operation.standard;

import com.dengchengchao.designpattern.facetorymethod.afterlast.operation.Operation;

/**
 * @author dengchengchao
 * @date 2018/12/21 16:30
 */
public class AddOperation extends Operation {

    @Override
    public double getResult() {
        return op1+op2;
    }


}
