package com.dengchengchao.designpattern.abstractfactory.before.impl;

import com.dengchengchao.designpattern.abstractfactory.before.Button;

/**
 * @author dengchengchao
 * @date 2019/2/13 11:08
 */
public class GreenButton implements Button {

    @Override
    public void click() {
        System.out.println("绿色按钮样式");
    }
}
