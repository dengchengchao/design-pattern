package com.dengchengchao.designpattern.abstractfactory.before.impl;

import com.dengchengchao.designpattern.abstractfactory.before.Button;

/**
 * @author dengchengchao
 * @date 2019/2/13 11:10
 */
public class BlueButton implements Button {

    @Override
    public void click() {
        System.out.println("蓝色按钮样式");
    }

}
