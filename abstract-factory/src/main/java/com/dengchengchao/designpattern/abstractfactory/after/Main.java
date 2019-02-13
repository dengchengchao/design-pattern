package com.dengchengchao.designpattern.abstractfactory.after;

import com.dengchengchao.designpattern.abstractfactory.before.TextBox;
import com.dengchengchao.designpattern.abstractfactory.before.Button;

/**
 * @author dengchengchao
 * @date 2019/2/13 11:23
 */
public class Main {

    public static void main(String[] args) {

        Factory factory=new GreenFactory();

        TextBox textBox = factory.getTextBox();
        Button button =factory.getButton();

        textBox.write();
        button.click();
    }
}
