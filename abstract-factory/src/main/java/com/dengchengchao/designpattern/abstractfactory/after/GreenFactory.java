package com.dengchengchao.designpattern.abstractfactory.after;

import com.dengchengchao.designpattern.abstractfactory.before.TextBox;
import com.dengchengchao.designpattern.abstractfactory.before.Button;
import com.dengchengchao.designpattern.abstractfactory.before.impl.BlueButton;
import com.dengchengchao.designpattern.abstractfactory.before.impl.GreenButton;
import com.dengchengchao.designpattern.abstractfactory.before.impl.GreenTextBox;

/**
 * @author dengchengchao
 * @date 2019/2/13 11:22
 */
public class GreenFactory implements  Factory {

    @Override
    public TextBox getTextBox() {
        return new GreenTextBox();
    }

    @Override
    public Button getButton() {
        return new GreenButton();
    }
}
