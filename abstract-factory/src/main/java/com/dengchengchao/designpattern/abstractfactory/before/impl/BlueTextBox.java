package com.dengchengchao.designpattern.abstractfactory.before.impl;

import com.dengchengchao.designpattern.abstractfactory.before.TextBox;

/**
 * @author dengchengchao
 * @date 2019/2/13 11:04
 */
public class BlueTextBox implements TextBox {

    @Override
    public void write() {
        System.out.println("蓝色文本框样式");
    }
}
