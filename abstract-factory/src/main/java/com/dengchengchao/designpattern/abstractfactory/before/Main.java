package com.dengchengchao.designpattern.abstractfactory.before;

import com.dengchengchao.designpattern.abstractfactory.before.impl.GreenButton;
import com.dengchengchao.designpattern.abstractfactory.before.impl.BlueTextBox;

/**
 * @author dengchengchao
 * @date 2019/2/13 11:11
 */
public class Main {


    public static void main(String[] args) {
        TextBox textBox =TextBoxFactory.createTextBox();
        Button button =ButtonFactory.createButton();

        textBox.write();
        button.click();
    }

}
